public class preorder {
    static int size =0;

    public static class Node {
        int data;
        Node left ;
        Node right;
        public Node (int data) {
            this.data = data;
            left= right = null ;

        }

    }
    public static void preOrder(Node root ) {
        if (root==null) return;
        // System.out.print(root.data + " ");
        size++;
        preOrder(root.left);
        preOrder(root.right);
    }
 public static  int size (Node root ){
    if (root == null) return 0;

     return 1 + size(root.left) + size(root.right);

 }
    
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node (10);
        root.left =a;
        root.right=b;
        Node c = new Node(6);
        Node d = new Node (5);
        a.left = c;
        a.right = d;
        Node f = new Node (11);
        b.right =f;
        
        preOrder(root);
       System.out.println(size);
    }
    
}
