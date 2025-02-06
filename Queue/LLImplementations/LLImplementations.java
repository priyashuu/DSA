
public class LLImplementations {
    public static class Node { // user defined data type
        int data; // data of the node
        Node next; // reference to the next node
        Node(int data){ // constructor to initialize the data
            this.data = data; // initialize the data
        }
    }
    public static class queueLL{ // user defind data structure 
        Node head = null ; // head of the queue initially null
        Node tail = null; // tail of the queue initially null
        int size =0 ;    // size of the queue initially 0

        // add method to add elements to the queue
        public void add(int x) { // x is the element to be added
            Node temp = new Node (x); //
            if (size==0){ // empty queue
                head =tail = temp; // head and tail are the same and point to the new node
                
            } 
            // if queue is not empty
            else {
                  tail.next=temp; // tail node points to the new node
                  tail=temp; // tail is the new node
            }
            size++;
        }
        // remove method to remove elements from the queue
        public int remove(){
            if(size ==0){
                System.out.println("Empty Queue ! ");
                return -1;
            }
            // if size of queue is not 0
            int x = head.data; // store the data of the head node in x
            head = head.next; // move the head pointer to the next node
            size --; // decrement the size of the queue
            return x; // return the element that was removed
        }
        // size method to return the size of the queue
        public int size(){
            if (size== 0) {
                System.out.println("empty queue !");
                return -1;
            }
            return size;
        }
        // display method to display the elements of the queue
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
