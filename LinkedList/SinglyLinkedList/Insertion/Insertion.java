// khudka eke data type bnaoge like Node , every element is node , every node has two types , one is data , another one is address , address is conneted to the next node  , first address stored the second addres of that element , last address will be  the null , every element have the address of the next elements , if we have address of the first elment , then we know every element , first data will be head  , if the element is connectted to the null then it is called tail 


public class Insertion {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
    public static void display(Node head){
        
        while (head != null) {
            System.out.print(head.data + " ");
            head=head.next;

        }
    }
    public static void displayRec (Node head) {
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        displayRec(head.next);
    }
    public static void displayRev (Node head) {
        if (head == null){
            return;
        }
        displayRec(head.next);
        System.out.print(head.data + " ");
        
    }
    public static void main(String[] args) {
        Node a =new Node(5);
        Node b = new Node(9);
        Node c =new Node(63);
        Node d =new Node(52);
        Node e =new Node(16);
        a.next=b;
        a.next.next=c;
        a.next.next.next=d;
        a.next.next.next.next=e;
        //printing the list 
    //     Node temp =a ;
    //    while(temp!=null){
    //     System.out.println(temp.data + "");
    //     temp=temp.next;
    //    }
        display(a);
        System.out.println();
        displayRec(a);
        System.out.println();
        displayRev(a);
        
    }

}