import java.util.*;

public  class QStacks {
    Stack <Integer> s1 = new Stack<>();
    Stack <Integer> s2 =new Stack<>() ;
    void push(int x){
        s1.push(x);
    }
    int  pop(){
        while(s1.size()>1){
            s2.push(s1.pop());
        }
        int x = s1.pop();
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        return x;

    }
    int  peek(){
        while(s1.size()>1){
            s2.push(s1.pop());
        }
        int x = s1.peek();
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        return x;

    }
 public boolean isEmpty(){
     return s1.isEmpty();}
    public static void main(String[] args) {
        QStacks queue = new QStacks();
    queue.push(1);
    queue.push(2);
    queue.push(3);

    System.out.println(queue.peek()); // Outputs 1 (front of the queue)
    System.out.println(queue.pop());  // Outputs 1 (removes front element)
    System.out.println(queue.isEmpty());
    }
    
}
