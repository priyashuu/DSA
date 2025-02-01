
import java.util.Stack;

public class display {
    public static void displayRevRec(Stack <Integer> st) {
          if (st.size()== 0) return;
          int top = st.pop();
          System.out.print(top+ " ");
          displayRevRec(st);
          st.push(top);
    }
    public static void displayRec(Stack <Integer> st) {
        if (st.size()== 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+ " ");
        st.push(top);
  }
    public static void main(String[] args) {
        Stack <Integer > st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // System.out.println(st);
        displayRevRec(st);
        System.out.println();
        displayRec(st);
        // System.out.println(st);



        // using another stack 
        // Stack <Integer> gt = new Stack<>();
        // while (st.size()> 0) {
        //     gt.push(st.pop());
        // }
        // while (gt.size()>0){
        //     st.push(gt.pop());
        //     System.out.print(st.peek() + " ");
        // }




        // using array
        // int n = st.size(); 
        // int [] arr = new int[n];
        // for (int i =n-1; i>=0; i--) {
        //     arr[i] =st.pop();
        // }
        // for (int i =0; i<n; i++) {
        //     System.out.print(arr[i] + " ");
        //     st.push(arr[i]);
        // }
        





    }
}
