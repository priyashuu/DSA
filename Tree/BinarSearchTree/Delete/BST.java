// Description: Delete a key in a Binary Search Tree.
// Time complexity: O(h), where h is the height of the tree.
// Space complexity: O(h), where h is the height of the tree.
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) { // Insert into the left subtree
            root.left = insert(root.left, data);
        } else { // Insert into the right subtree
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return; // Base case for recursion
        inorder(root.left); // Traverse the left subtree
        System.out.print(root.data + " "); // Visit the root node
        inorder(root.right); // Traverse the right subtree
    }

    public static Node delete(Node root, int x) {
        if (root == null) return null; // If the tree is empty or key not found

        if (root.data > x) { // Search in the left subtree
            root.left = delete(root.left, x);
        } else if (root.data < x) { // Search in the right subtree
            root.right = delete(root.right, x);
        } else { // root.data == x, this is the node to be deleted
            // Case 1: No children (leaf node)
            if (root.left == null && root.right == null) return null;

            // Case 2: Only one child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            Node IS = inorderSuccessor(root.right); // Find the inorder successor of the node to be deleted 
            root.data = IS.data; // Copy the inorder successor's data to the node to be deleted
            root.right = delete(root.right, IS.data); //
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) { // Find the inorder successor of a node in a BST   
        while (root.left != null) { // Find the leftmost node in the right subtree of the node to be deleted in order to maintain the BST property 
            root = root.left; // Traverse the left subtree of the right child of the node to be deleted 
        }
        return root;
    }

    public static void main(String[] args) {
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        System.out.println("Inorder traversal before deletion:");
        inorder(root);
        System.out.println();

        root = delete(root, 8); // Delete node with value
        root = delete(root, 14);
        insert(root,89); 

        System.out.println("Inorder traversal after deletion:");
        inorder(root);
        System.out.println();
    }
}
