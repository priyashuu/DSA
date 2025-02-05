package Tree.BinaryTree.Traversal.PostOrder;
public class Postorder {
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
    public static void PostOrder(Node root ) {
        if (root== null) return ;
        PostOrder(root.left);
        
        PostOrder(root.right);
        System.out.print(root.data + "  ");

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
        
        PostOrder(root);
    }
    
}
