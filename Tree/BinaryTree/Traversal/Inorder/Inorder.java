public class Inorder {
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
    public static void InOrder(Node root ) {
        if (root== null) return ;
        InOrder(root.left);
        System.out.print(root.data + "  ");
        InOrder(root.right);

    }

   
    
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node (3);
        root.left =a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node (5);
        a.left = c;
        a.right = d;
        Node e = new Node (6);
        Node f = new Node (7);
        b.left = e;
        b.right =f;
        
        InOrder(root);
    }
    
}
