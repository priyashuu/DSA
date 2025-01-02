public class Insertion {
   public static class Node {
       int data;
       Node next;
       Node(int data) {
           this.data=data;
       }
   }
   public static class LinkedList {
      Node head= null;
      Node tail =  null ;
      void insertAtEnd(int val ){
         Node temp =new Node (val);
         if (head == null){
            head=temp;
            
         }
         else{
            tail.next=temp;
           
         }
         tail=temp;
      }
      void display(){
         while (head !=null){
            System.out.println(head.data + " ");
            head =head.next;
         }
      }
   }
   
    
   public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.insertAtEnd(7);
      ll.insertAtEnd(6);
      ll.display();

   }

}