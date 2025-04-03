import java.util.*;

public class BST1 { // ! USE RECURSION
/*
 *                            4
 *                          /   \ 
 *                         2     5
 *                       /  \     \
 *                      1    3     6
 * 
 * 
 ?  LEFT SUBTREE < ROOT
 ?  RIGHT SUBTREE > ROOT

 ! LEFT NODE-> ROOT NODE-> RIGHT NODE
 */
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // ! Search in a Binary Search Tree
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        }

        else {
            return search(root.right, key);
        }
    }

    // ! Print in range
    public static void printrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printrange(root.right, k1, k2);
        }

        else if (root.data < k1) {
            printrange(root.left, k1, k2);
        } else {
            printrange(root.right, k1, k2);
        }
    }

    //! Print root to Leaf
    public static void printpath( ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }


    public static void roottoleaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
        }
        roottoleaf(root.left, path);
        roottoleaf(root.right, path);
        path.remove(path.size()-1);
    }

    //! Validation of BST
    // ? check if max values in left subtree < node
    // ? and min value in right subtree > node

    public static boolean isValid(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }

        return  isValid(root.left, min, max) && isValid(root.right, root, max);
    }


    //! Mirror a BST
    public static Node mirroebst(Node root){
        if (root == null) {
            return null;
        }

        Node leftmirror = mirroebst(root.left);
        Node rightmirror = mirroebst(root.right);

        root.left = rightmirror;
        root.right = leftmirror;

        return root;
    }

    public static void preorder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        // int values[] = {5, 1, 3, 4, 2, 7};
        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        int values[] = {8, 5, 10, 3, 6, 11};
        
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        // if (search(root, 1)) {
        // System.out.println("FOUNT!");
        // }
        // else{
        // System.out.println("NOT FOUND!");
        // }

        // printrange(root, 5, 12);


        // roottoleaf(root, new ArrayList<>());

        // if (isValid(root, null, null)) {
        //     System.out.println("Valid");
        // }

        // else{
        //     System.out.println("Not valid!");
        // }

        root = mirroebst(root);
        preorder(root);
    }
}
