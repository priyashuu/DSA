
import java.util.*;


public class LinearSearch {
     public static void main(String[] args) {
        int n , i, item ;
        int[] a;
        Scanner sc =new Scanner(System.in);
        System.out.println("How many elements do you need ");
        n=sc.nextInt();
        a =new int[n];
        System.out.println("enter elements");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the item that you want to find ");
        item =sc.nextInt();
        int c=0 ;
        for (i=0;i<a.length;i++){
            if (a[i]== item){
                c++;
                break;
            }
            
        }
        if (c>0){
            System.out.println("Item exists");

        }
        else{
            System.out.println("Item dosent exit");
        }
        
     }
    
}