import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer > st = new Stack<>();
        System.out.println(st.isEmpty());
           
        st.push(23);
        st.push(29);
        st.push(12);
        st.push(10);
        st.push(5); 
        //peek : Return the top element from the stack
        // System.out.println(st.peek());
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // st.pop();
        System.out.println(st);
        System.out.println("The size is : " + st.size());
        // while (st.size() >2){
        //     st.pop();
        // }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}
