//  create a stack using array implementation and perform push, pop, peek, display, size, isEmpty, isFull, capacity operations.
public class ArrayImplementation {
    public static class Stack { // user defined data structure
        private int[] arr = new int[4]; // array of size 4
        private int idx = 0; // very important , idx is important it is lik top element in stack in array
                             
        // add element to the stack

        void push(int x) {
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x; // add element to the stack at index idx and increment idx by 1 to point to the next empty
                          // index in the stack 
            idx++;
        }

        // get the top element of the stack
        int peek() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            ;
            return arr[idx - 1];// return the top element of the stack 
        }

        // remove the top element of the stack
        int pop() {
            if (idx == 0) {
                System.out.println("Stack is Empty ! ");
                return -1;
            }
            int top = arr[idx - 1]; // get the top element of the stack 
            arr[idx - 1] = 0; // remove the top element of the stack by setting it to 0
            idx--; // decrement idx by 1 to point to the next top element of the stack 
            return top; // return the top element of the stack
        }

        // display the stack elements
        void display() {
            for (int i = 0; i < idx; i++) { // iterate through the stack elements from index 0 to idx-1
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // get the size of the stack
        int size() {
            return idx;
        }

        // check if the stack is empty
        boolean isEmpty() {
            if (size() == 0)
                return true;
            else
                return false;
        }// check if the stack is full

        boolean isFull() {
            if (idx == arr.length)
                return true;
            else
                return false;
        } // get the capacity of the stack

        int capacity() {
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(6);
        st.display();// 6
        st.push(3);
        st.display(); // 6 3
        st.push(1);
        st.display();// 6 3 1
        System.out.println(st.size());// 3
        // st.pop();
        // st.display(); // 6 3
        st.push(9);
        st.display();
        st.push(7);

    }

}
