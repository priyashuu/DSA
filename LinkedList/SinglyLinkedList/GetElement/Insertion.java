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

       void insertAtBeg(int val) {
           Node temp = new Node(val);
           if (head == null) { // Empty list
               tail = temp;
           } else { // Non-empty list
               temp.next = head;
           }
           head = temp; // Update head
       }

       void insertAtEnd(int val) {
           Node temp = new Node(val);
           if (head == null) { // Empty list
               head = temp;
           } else { // Non-empty list
               tail.next = temp;
           }
           tail = temp; // Update tail
       }

       void display() {
           Node temp = head;
           while (temp != null) {
               System.out.print(temp.data + " "); // Print data on the same line
               temp = temp.next;
           }
           System.out.println(); // Add a new line after all elements are printed
       }
       int getAt(int idx){
         Node temp =head;
         for (int i =1; i<=idx;i++){
             temp=temp.next;
 
         }
         return temp.data;
     }
   }

   public static void main(String[] args) {
       LinkedList ll = new LinkedList();

       // Insert elements
       ll.insertAtBeg(7);
       ll.insertAtBeg(6);
       ll.insertAtBeg(0);
       ll.insertAtEnd(90);
       ll.insertAtBeg(45);

       // Display the linked list
       ll.display();
       System.out.println(ll.getAt(4));
   }
}
