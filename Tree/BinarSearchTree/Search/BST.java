// Description: Search for a key in a Binary Search Tree.
// Time complexity: O(h) where h is the height of the tree.
// Space complexity: O(h) where h is the height of the tree.
public class BST {
    static class Node {
        int data ; 
        Node left ;
        Node right ;
        Node (int data){
            this.data= data;
            left=right = null ;
        }
    }
    public static Node insert(Node root , int data){ // return Node datatype because we are returning the root node
       if (root == null){
        return new Node(data);
        
       }
       if (root.data>data){ // if the data is less than the root node then it should be inserted in the left subtree
              root.left = insert(root.left, data);
        }
       else { // if the data is greater than the root node then it should be inserted in the right subtree
        root.right = insert(root.right, data);
       }
       return root;
    }
    public static void inorder (Node root){
        if (root==null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean Search(Node root, int key){
        if(root== null) return false;
        if(root.data==key) return true;
        if(root.data>key) return Search(root.left,key);
        return Search(root.right,key);

    }
    public static void main(String[] args) {
        int value [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i =0 ; i<value.length; i++){
           root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
       if(Search(root, 5)){
        System.out.println("The Key is found");
       }else{
        System.out.println("The key is not found");
       }
    }
    
}
