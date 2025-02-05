
public class arrayImplementations {
    public static class queueA {
        int f = -1; // front pointer initially -1
        int r = -1; // rear pointer initially -1
        int size = 0; // size of queue initially 0
        int[] arr = new int[10]; // array of size 10

        // add method to add elements to queue
        public void add(int x) { // x is the element to be added
            if (r == arr.length - 1) { // if rear pointer is at the end of the array
                System.out.println("Queue is full"); // queue is full
                return; // return from the method
            }
            if (f == -1) { // queue is currently empty so front and rear pointers are at -1
                f = r = 0; // front and rear pointers are at 0
                arr[0] = x; // add the element to the array at index 0

            } // if queue is not empty
            else { // if queue is not empty
                arr[++r] = x; // increment rear pointer and add the element to the array at the new index
            }
            size++; // increment the size of the queue

        }
     // remove method to remove elements from the queue
        public int remove() { // return type is int
            if (size == 0) { // if size of queue is 0 then queue is empty
                System.out.println("Queue is empty !"); // print queue is empty
                return -1; // return -1 because queue is empty
            }// if size of queue is not 0
            int x = arr[f]; // store the element at front pointer in x
            f++; // increment front pointer
            size--; // decrement size of queue
            return x; // return the element that was removed

        }
// peek method to return the element at the front of the queue
        public int peek() {
            if (size == 0) { // if size of queue is 0 then queue is empty
                System.out.println("Queue is empty !"); // print queue is empty
                return -1; // return -1 because queue is empty
            }
            // if size of queue is not 0
            return arr[f]; //   return the element at the front of the queue
        }
 /// isEmpty method to check if the queue is empty
        public boolean isEmpty() {
            if (size == 0) // if size of queue is 0 then queue is empty
                return true;
            else // if size of queue is not 0 then queue is not empty
                return false;
        }
// display method to display the elements of the queue
        public void display() {
            if (size == 0) { // if size of queue is 0 then queue is empty
                System.out.println("Queue is empty");
            } else {// if size of queue is not 0 then queue is not empty
                for (int i = f; i <= r; i++) { // loop from front pointer to rear pointer
                    System.out.print(arr[i] + " ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        q.peek();
        System.out.println(q.isEmpty());

        System.out.println(q.size);

    }
}
