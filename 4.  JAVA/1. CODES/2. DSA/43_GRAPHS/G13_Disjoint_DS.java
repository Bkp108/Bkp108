/*
 ! DISJOINT SET DATA STRUCTURE / UNION FIND DATA STRUCTURE
 ? store and track non-overlapping sets
 ? use for cycle detection in graph

 ? 1. Find: find(2)
 * which set belongs to(find 2 is in which group or set)
 * 
 ? 2. Union: union(4, 8)
 * join
 */


public class G13_Disjoint_DS {
    static int n=7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x){
        if (x == par[x]) {
            return x;
        }

        return find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else{
            par[parB] = parA;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);

    }
}
