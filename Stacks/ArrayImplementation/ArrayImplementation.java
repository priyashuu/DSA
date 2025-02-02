import java.util.Stack;

public class ArrayImplementation {
    public static class Stack {
        private int [] arr = new int [4];
        private int idx = 0; /// very important , idx is important it is lik top element
        void push(int x){
            if (isFull()){
                System.out.println("stack is full");
                return;
            }
            arr [idx] =x;
            idx++;
        }
        int peek(){
            if (idx==0){
                System.out.println("stack is empty");
                return -1;
            };
            return arr[idx-1];
        }
        int pop(){
            if (idx==0){
                System.out.println("Stack is Empty ! ");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] =0;
            idx--;
            return top;
    }
    void display(){
        for(int i =0; i<idx;i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    int size(){
        return idx;
    }
    
boolean isEmpty(){
    if(size()==0)return true;
    else return false;
}
boolean isFull(){
    if(idx==arr.length) return true;
    else return false;
}
int capacity(){
    return arr.length;
}
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(6);
        st.display();//6
        st.push(3);
        st.display(); //6 3
        st.push(1);
        st.display();//6 3 1
        System.out.println(st.size());//3
        // st.pop();
        // st.display(); // 6 3
        st.push(9);
        st.display();
        st.push(7);

    }
    
}
