
public class LLImplementations {
    public static class Node { // user defined data type
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class queueLL{ // user defind data structure 
        Node head = null ;
        Node tail = null;
        int size =0 ; 
        public void add(int x) {
            Node temp = new Node (x);
            if (size==0){
                head =tail = temp;
                
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
            return size;
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
        public boolean isEmpty(){
            if(size ==0 )return true;
            else return false;
                
        }
        public int peek(){
            if(size== 0){
                System.out.println("empty is queue");
                return -1;
            }
            return head.data;
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
        System.out.println(q.peek());;
        
    }
}
