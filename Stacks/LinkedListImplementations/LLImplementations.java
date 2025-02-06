// 
public class LLImplementations {

    public static class Node{ // user defined data type 
        int data;
        Node next;
        Node (int data){
            this.data= data;
        }
    }
    public static class LLStack{ // user defined data structure
        Node head = null; 
        int size = 0;
        // push method to add elements to the stack
        void push (int x){ // everytime
            Node temp  = new Node(x);
            temp.next =head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.data;
            return x;
        
        }

        void displayRev(){
            Node temp = head ;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp =temp.next;
               

            }
            System.out.println();
        }

        // display method to display the elements of the stack
        void displayrec(Node h){
            if (h==null)return;
            displayrec(h.next);
            System.out.print(h.data+ " ");
        }
        void display() {
        
               displayrec(head);
               System.out.println();
        }
        int size (){ // getter
            return size;
        }
        boolean isEmpty(){
            if (size()==0) return true;
            return false;

        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();// 4 
        st.push(5);
        st.display(); //  5 4
        st.push(1);
        st.display() ; // 4 5 1
        System.out.println(st.size()); //3
        st.pop();
        st.display(); // 4 5 
        System.out.println(st.size()); // 2
        st.push(7);// 4 5 7
        st.push(8); // 4 5 7 8
        st.display();


        
    }
}