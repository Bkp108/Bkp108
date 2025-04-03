import java.util.*;

public class BT1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BINARYTREE {
        /* //! --------TREE--------
         *                1
         *              /  \
         *             2    3
         *           /  \    \
         *          4    5    6
         */
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }

        //! preorder treversal
        //? 1nd root
        //? 2st left
        //? 3rd right
        
        public static void preorder(Node root){
            if (root == null) {
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        
        //! inorder treversal
        //? 1st left
        //? 2nd root
        //? 3rd right
        public static void inorder(Node root){
            if (root == null) {
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }

        //! postorder treversal
        //? 1st left
        //? 2rd right
        //? 3nd root
        public static void postorder(Node root){
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //! Level order using queue(a kind of breadth first search)
        public static void levelorder(Node root){
            if (root==null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currnode = q.remove();
                if (currnode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currnode.data+" ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }
        }

        
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BINARYTREE.buildtree(nodes);
        // System.out.println(root.data);
        
        System.out.print("PRE-ORDER TREVERSAL: ");
        BINARYTREE.preorder(root);
        System.out.println();
        System.out.print("IN-ORDER TREVERSAL: ");
        BINARYTREE.inorder(root);
        System.out.println();
        System.out.print("POST-ORDER TREVERSAL: ");
        BINARYTREE.postorder(root);

        System.out.println("LEVEL ORDER:");
        BINARYTREE.levelorder(root);
    }
}
