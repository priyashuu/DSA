public class Insertion {
    public static class Node {
       int data;
       Node next;
 
       Node(int data) {
          this.data = data;
       }
    }
 
    public static class LinkedList {
       Node head = null;
       Node tail = null;
 
       void insertAtBeg(int val){
        Node temp = new Node(val);
        if (head==null){ // empthy list
            tail=temp;
        }else{// non -empty
            temp.next=head;
            

        }
        head =temp;


       }
       void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
           head = temp;

        } else {
           tail.next = temp;

        }
        tail = temp;
     }
 
       void display() {
          Node temp = head ;
          while (temp != null) {
             System.out.println(temp.data + " ");
              temp = temp.next;
          }
          System.out.println();
       }
       void insertAtSpec(int idx ,int val){
        Node t = new Node(val);
        Node temp = head;
        for (int i =1 ; i<=idx-1 ; i++){
            temp=temp.next;

        }
        t.next=temp.next;
        temp.next=t;



    }
      
    }
 
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.insertAtBeg(7);
       ll.insertAtBeg(6);
       ll.insertAtBeg(0);
   
       ll.insertAtEnd(90);
       ll.insertAtBeg(45);
       ll.display();
       ll.insertAtSpec(3, 340);
       ll.display();
      
 
    }
 
 }