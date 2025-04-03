/*
 ! GRAPH'S: COLLECTION'S OF NODES
 * GRAPH(VERTEX, EDGES)
 * VERTEX: NUMBER OF NODES

 ? Type's of GRAPH:
 *               ---> UNI-DIRECTIONAL Edges
 *               ---> UN-DIRECTED / BI-DIRECTIONAL Edges
 *
 *               ---> WEIGHTED GRAPH
 *               ---> UN-WEIGHTED GRAPH

 ? GRAPH STRUCTURE REPRESENTATION:
 *                     ---> Adjacency List
 *                     ---> Adjacency Matrix
 *                     ---> Edge List
 *                     ---> 2D Matrix(Implicit Graph)
 
 ? EXAMPLE:- GRAPH
 *       0       2___________4
 *        \   /    \
 *          1_______3
 * 
 * UN-DIRECTIONAL, UN-WEIGHTED GRAPH
 * (V,E) = (4, 4)
 * 
 ? 1. ADJACENCY LIST:
 *       
 *     0-> (1)
 *     1-> (0, 2, 3)
 *     2-> (1, 3)
 *     3-> (1, 2)
 * 
 * represent as list = {{1}, {0,2,3}, {1,3}, {1,2}}

 ? 2. ADJACENCY MATRIX
 *               0   1    2   3
 *          0   [0   1    0    0]
 *          1   [1   0    1    1]
 *          2   [0   1    0    1]
 *          3   [0   1    1    0]
 * 
 * 
 * if the weight is given then we write weight in the place of '1'
 * 
 ? 3. EDGE LIST
 *  {start, end, weight of edge}
 * edges = {{0, 1, 4}, {1, 2, 2}, {1, 3, 3}, {2, 3, -1}}
 * 
 * 
 ! APPLICATION'S OF GRAPH'S
 ? 1. Map's(Shortest Path)
 ? 2. Social Media Network 
 ? 3. Delivery Network(Shortest Cycle Route)
 ? 4. Physics & Chemistry
 ? 5. Routing Algorithm
 ? 6. Machine learning(Computation Graph)
 ? 7. Computer Vision
 */

 import java.util.*;
public class G1 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args){
        //! Creating a Graph
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V]; //null -> empty arraylist
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>(); 
        }

        //0 vertex
        graph[0].add(new Edge(0, 1, 5));
        
        
        //1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 3));
        graph[1].add(new Edge(1, 2, 1));
        
        
        //2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        
        
        //3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
                
        
        //4 vertex
        graph[4].add(new Edge(4, 2, 2)); 

        // print neighbour of 2 no. node
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i); 
            System.out.println(e.dest);
        }
        
    }
}
