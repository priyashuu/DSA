

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev ;
        Node (int data){
            this.data=data;
        }
    }
    public static void display (Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void displayRev (Node tail){
        // 4 10 2 99 13 
        Node temp = tail;
        while (temp!=null){
            
            System.out.print(temp.data+ " ");
            temp = temp.prev;
            
        }
        System.out.println();
       
    }
    public static void displayRandom (Node Random){
        Node temp = Random;
        // move this tem backword to the head
        while (temp.prev!=null){
            temp = temp.prev;
            
            
        }
        while (temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void insertAtIdx(Node head ,int idx, int x ){
           Node s = head ;
           for (int i =1 ; i<=idx-1; i++) {
              s=s.next;
           }
           Node r = s.next;
           Node t= new Node(x);
           s.next =t;
           t.prev=s;
           t.next=r;
           r.prev =t;

        
    }
    public static void main(String[] args) {
        Node a = new Node (4);
        Node b = new Node (10);
        Node c = new Node (2);
        Node d = new Node (99);
        Node e = new Node (13);
        a.prev=null;
        a.next =b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next =null;
        // displayRev  (e);
        // displayRandom(c);

       insertAtIdx(a,2,90);
       display(a);
       
    
        
    }
}
