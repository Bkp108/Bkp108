/*
 ! TRIE DATAT STRUCTURE(prefix tree)(retrevel tree)
 ? In a tries there are multiple children of a tree not like binary tree
 ? very less time complexity
 ?
 */
public class T1 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
        
        public static Node root = new Node();

        public static void insert1(String words) { //* O(L)
            Node curr = root;
            for (int level = 0; level < words.length(); level++) {
                int idx = words.charAt(level) - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }

                curr = curr.children[idx];
            }

            curr.eow = true;
        }

        public static boolean searching1(String key){ //* O(L)
            Node curr = root;
            for (int level = 0; level < key.length(); level++) {
                int idx = key.charAt(level) - 'a';
                if (curr.children[idx] == null) {
                    return false;
                }

                curr = curr.children[idx];
            }

            return curr.eow; // Fixed: return curr.eow instead of curr.eow = true;
        }

        public static boolean wordbreak(String key1){
            if (key1.length() == 0) {
                return true;
            }

            for (int i = 0; i <= key1.length(); i++) {
                if (searching1(key1.substring(0, i)) &&  wordbreak(key1.substring(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        /*
         ! TRIE'S TREE LOOK LIKE:-
         *                                -                          
         *                              /   \                       
         *                             T     A                        
         *                            /        \                      
         *                           H          N                     
         *                          /            \                    
         *                        E               Y                  
         *                      / |  \                                 
         *                    R   I   E                                
         *                  /     |
         *                 E      R
         */
        for (int i = 0; i < words.length; i++) {
            Node.insert1(words[i]);
        }

        System.out.println(Node.searching1("the"));
        System.out.println(Node.searching1("theee"));
        
        String key1 = "theatheretheiranythee";
        System.out.println(Node.wordbreak(key1));
    }
}
