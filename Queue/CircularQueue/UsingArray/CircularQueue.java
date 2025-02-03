
public class CircularQueue {
    public static class CqueueA {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int data) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");

            } else if (size == 0) {
                front = rear = 0;
                arr[0] = data;

            } else if (rear < arr.length - 1) {// normal case
                arr[++rear] = data;

            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = data;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");

            } else {
                int x = arr[front];
                if (front == arr.length - 1)
                    front = 0;
                else
                    front++;
                    size --;
                return x;
            }
           
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty ! ");
            } else
                return arr[front];
        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }

            } else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }

            }
            System.out.println();

        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }
        
    }
    public static void main(String[] args) throws Exception {
        CqueueA q = new CqueueA();
        q.display();
       q.add(1);
       
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(6);
        q.display();
        q.remove();
        q.add(7);
        q.display();
    }
}

