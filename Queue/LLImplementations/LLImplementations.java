
public class LLImplementations {
    public static class Node { // user defined data type
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class queueLL{
        Node head = null ;
        Node tail = null;
        int size =0 ; 
        public void add(int x) {
            Node temp = new Node (x);
            if (size==0){
                head =tail = temp;
                System.out.println("");
            }
            else {
                  tail.next=temp;
                  tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size ==0){
                System.out.println("Empty Queue ! ");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size --;
            return x;
        }
        public int size(){
            if (size== 0) {
                System.out.println("empty queue !");
                return -1;
            }
            return head.data;
        }
        public void display(){
            if ( size == 0 ) {
                System.out.println("empty Queue");
                return;
            }
            else{
                Node temp = head;
                while (temp!= null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }

        }
       
    }
    public static void main(String[] args) {
         queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        
    }
}
