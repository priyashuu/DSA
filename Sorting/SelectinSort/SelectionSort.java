

import java.util.Scanner;

public class SelectionSort {
    public static void main (String [] args ){
        int n , i ,loc, temp , j ;
        int [] a;
        Scanner sc = new Scanner(System.in); 
        System.out.println("how many elements do you need ?");
        n=sc.nextInt();
        a =new int[n];
        System.out.println("Enter the elements");
        for (i =0; i<n ; i++){
            a[i]=sc.nextInt();

        }
        for (i=0;i<n-1;i++){ // for i =0 to n-1
            loc=i; // loc = i
            for (j=i+1;j<n;j++){ // for j = i+1 to n  for example 1 to 5 in first iteration j = 1 to 5
               if(a[j]<a[loc]){ // if a[j]<a[loc] in first iteration a[1]<a[0] 2nd element is less than 1st element
                loc =j; // then loc = j 2ns element is less than 1st element
               }
            }
            temp=a[i]; // temp = a[i] 1st element
            a[i]=a[loc]; // a[i]=a[loc] 1st element = 2nd element
            a[loc]=temp; // a[loc]=temp 2nd element = 1st element
        }
        System.out.println("Sorted element");
for (i=0;i<n;i++){
    System.out.println(a[i]);
}
    }
}
