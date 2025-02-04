
public class SizeMax  {
    public static class Node {
        int data;
        Node left; 
        Node right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
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
        

    }
}
