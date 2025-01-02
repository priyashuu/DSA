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
            System.out.println(head.data + " ");
             temp = temp.next;
         }
      }
      int length () {
         Node temp = head;
         int count = 0;
         while(temp!= null ){
            count ++;
            temp=temp.next;

         }
         return count ;
      }
   }

   public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.insertAtEnd(7);
      ll.insertAtEnd(6);
      ll.display();
      System.out.println(ll.length());

   }

}