import java.util.*;
//! CYCLE IN GRAPH
//* DIRECTED
import java.util.*;

public class G5_detect_cycle_directional {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void creategraph(ArrayList<Edge>[] graph, int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean iscycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (iscycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean iscycleUtil(ArrayList<Edge>[] graph, int curr,  boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }

            if (!vis[e.dest] && iscycleUtil(graph, e.dest, vis, stack)) {
                return true;
            } 
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        creategraph(graph, V);
        System.out.println(iscycle(graph));
    }
}
