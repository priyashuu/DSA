import java.util.Scanner;
import java.util.Stack;

public class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer > st =new Stack<>();
        // int n ;
        // System.out.print("Enter the no of elements you want to insert  : ");
        // n = sc.nextInt();
        // System.out.print("Now Enter the elements");
        // for (int i =1 ; i<=n ; i++) {
        //     int x = sc.nextInt();
        //     st.push(x);
       // }
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);

        System.out.println(st);
        // reverse order 
        Stack <Integer> rt = new Stack<>();
        while (st.size()>0){
           
            rt.push(st.pop());
          
        }
        System.out.println(rt);
        Stack <Integer> gt = new Stack<>();
        while (rt.size()>0){
           
            gt.push(rt.pop());
          
        }
        System.out.println(gt);  
    }
}
