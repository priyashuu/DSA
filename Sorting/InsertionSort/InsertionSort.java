import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int n, i, j,temp;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you need : ");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i=1;i<=n-1;i++)
        {
            temp =a[i];
            j=i-1;
            while(j>=0 && temp < a[j]){
                a[j+1]=a[j];
                j=j-1;
                
            }
            a[j+1]=temp;
        }
        System.out.println(" Sorted elements are ");
        for (i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }

}