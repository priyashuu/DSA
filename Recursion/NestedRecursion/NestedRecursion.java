public class NestedRecursion {
    public static int NestedRec (int n ) {
        if (n>100){
            return n-10;
        }else {
            return NestedRec(NestedRec(n+11));
        }
    }
    public static void main(String[] args) {
       int result = NestedRec(100);
        System.out.println("result will be " + result);
    }
   
}