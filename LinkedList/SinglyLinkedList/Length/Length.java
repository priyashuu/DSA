public class Length {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
   public static int length(Node head){
    int count =0;
    while(head!= null){
        count ++;
        head=head.next;

    }
    return count;
   }
   public static void main(String[] args) {
        Node a =new Node(5);
        Node b = new Node(9);
        Node c =new Node(63);
        Node d =new Node(52);
        Node e =new Node(16);
        Node f =new Node(16);

        a.next=b;
        a.next.next=c;
        a.next.next.next=d;
        a.next.next.next.next=e;
        System.out.println(length(a));
        
    }
}