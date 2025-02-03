
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class display{
    
    public static void main(String[] args) {
        Queue <Integer> r  = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
    while(q.size()>0){
        System.out.print(q.peek() + " ");
        r.add(q.remove());
       
      
     }
     System.out.println();
     while(r.size()>0){
       
        q.add(r.remove());
       
      
     }
     System.out.println(q);
   
    }
}
