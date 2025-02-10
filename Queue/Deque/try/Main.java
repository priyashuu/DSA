import java.util.*;

class DequeImplementation<T> {
    Deque <Integer>  deque = new LinkedList<>();

 

    // Add element to the front
    public void addFront(int item) {
        deque.addFirst(item);
    }

    // Add element to the rear
    public void addRear(int item) {
        deque.addLast(item);
    }

    // Remove element from the front
    public int removeFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque.removeFirst();
    }

    // Remove element from the rear
    public int removeRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque.removeLast();
    }

    // Peek element at the front
    public int peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque.getFirst();
    }

    // Peek element at the rear
    public int peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque.getLast();
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get the size of the deque
    public int size() {
        return deque.size();
    }

    // Display the deque
    public void display() {
        System.out.println("Deque: " + deque);
    }

}
public class Main {
    public static void main(String[] args) {
        DequeImplementation<Integer> deque = new DequeImplementation<>();

        // Adding elements to the deque
        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(5);
        deque.addRear(30);

        System.out.println("After adding elements:");
        deque.display();

        // Removing elements from the deque
        System.out.println("Removed from front: " + deque.removeFront());
        System.out.println("Removed from rear: " + deque.removeRear());

        System.out.println("After removing elements:");
        deque.display();

        // Checking peek and size
        System.out.println("Peek Front: " + deque.peekFront());
        System.out.println("Peek Rear: " + deque.peekRear());
        System.out.println("Size: " + deque.size());
    }
}
