/*
 ! TOPOLOGICAL SORTING
 ? Directed Acyclic Graph(DAG) is a directed graph with no cycles.

 ? Topological sorting is used only for DAGs not for non-DAGs

 ? It is a linear order of vertices such that every directed edge u-> v
 ? the vertex u comes before v in the order
 */

import java.util.*;

public class G6_Topology_Sorting {

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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // ! TOPOLOGICAL SORT USING DFS
    public static void topsortdfs(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topsortUtildfs(graph, i, vis, s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topsortUtildfs(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                topsortUtildfs(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    
    
    // ! TOPOLOGICAL SORT USING BFS
    
    public static void topsortbfs(ArrayList<Edge>[] graph) {
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        // Calculate in-degree for each vertex
        for (int i = 0; i < graph.length; i++) {
            for (Edge e : graph[i]) {
                indeg[e.dest]++;
            }
        }

        // Add vertices with in-degree 0 to the queue
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // Perform BFS
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        // ! DFS
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph, V);
        topsortdfs(graph);

        // ! BFS

        // ArrayList<Edge> graph[] = new ArrayList[V];
        // creategraph(graph, V);
        System.out.println();
        topsortbfs(graph);
    }
}
