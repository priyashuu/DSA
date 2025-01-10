import java.util.*;
public class BubbleSort {
    public static void main (String [] args){
        int n , i ,k,temp;
        int [] a;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the how many elements do you need : ");
        n=sc.nextInt();
        a =new int[n];
        System.out.println("Enter the elements here");
        for (i =0 ;i<n; i++){
            a[i]=sc.nextInt();

        }
        for (i =1 ;i<n-1;i++  ){
             for (k=0 ; k<n-i-1;k++){ 
                if (a[k] > a[k+1]){
                    temp =a[k];
                    a[k]=a[k+1];
                    a[k+1] =temp ;
                }
             }
        }
        System.out.println("Sorted element is ");
        for ( i=0 ; i<n;i++ ){
           
            System.out.println(a[i]);
        }


    
    }
    
    
}
