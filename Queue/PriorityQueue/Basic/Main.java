import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(10);
        pq.add(23);
        System.out.println(pq); // [5, 10, 23]
        pq.remove();
        System.out.println(pq);// [10, 23]
        System.out.println(pq.peek()); // 10
        while(!pq.isEmpty()){
            System.out.println(pq.poll()); // 10 23 pq.pool() removes the element from the queue
        }
    }
    
}
