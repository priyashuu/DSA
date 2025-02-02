import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack <Integer> gt = new Stack<>();
        Stack <Integer> at = new Stack<>();

        System.out.println( "The st will be " + st );
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("The gt will be " + gt);
        while(gt.size()>0){
            at.push(gt.pop());
        }
        System.out.println("The at will be " + at);
        while(at.size()>0){
            st.push(at.pop());
        }
        System.out.println("The st will be " + st);
        



    }
}
