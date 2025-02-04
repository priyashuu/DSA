import java.util.*;

public class deque{

    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();
        // dq.addLast(1);
        // dq.addLast(2);
        // dq.addLast(3);
        // dq.addLast(4);
        // System.out.println(dq);

        // dq.addFirst(5);
        // dq.removeLast();
        // System.out.println(dq);
        // dq.removeFirst();
        // System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.add(5); // add() is same as addLast()
       // dq.remove(); // remove() is same as removeFirst()
        //dq.removeAll(dq); // remove all elements
        dq.removeFirstOccurrence(1); // remove first occurrence of 1
        dq.removeLastOccurrence(2);// remove last occurrence of 2
        dq.removeFirstOccurrence(1); // remove first occurrence of 1
       System.out.println(dq);
        
    }
}