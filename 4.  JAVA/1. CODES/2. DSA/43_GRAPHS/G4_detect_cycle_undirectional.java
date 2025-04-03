//! CYCLE IN GRAPH
//* UNDIRECTED
import java.util.*;

public class G4_detect_cycle_undirectional {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectcycle(ArrayList<Edge>[] graph, int V) {
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (detectcycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false; 
    }

    public static boolean detectcycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                if (detectcycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            } 
            else if (e.dest != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph, V);
        System.out.println(detectcycle(graph, V));

        // if (detectcycle(graph, V)) {
        //     System.out.println("Graph contains cycle");
        // } else {
        //     System.out.println("Graph doesn't contain cycle");
        // }
    }
}
