import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicsSTL {
    public static void main(String[] args) {
        Queue <Integer> r  = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());
        q.remove();//q.remove() == q.poll()
        System.out.println(q.size());
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());// q.element == q,peek top elememt ko return krta h
        System.out.println(q.peek());
    }
    
}
