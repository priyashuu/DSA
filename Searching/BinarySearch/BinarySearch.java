import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int n, i,c=0,mid=0,items, beg, end ;
        int [] a;
        Scanner sc =new Scanner(System.in);
        System.out.println("How many elements do you need : ");
        n=sc.nextInt();
        a =new int[n];
        System.out.println("enter the elements");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        System.out.println("enter the elements do you want to find ");
       items=sc.nextInt();
       beg=0;end=n-1;
       while(beg<=end){
        mid=(beg+end )/2;
        if (items ==a[mid]){
            c++;
            break;
        }
        else if (items>a[mid]){
            beg=mid+1;
        }
        else if (items<a[mid]){
            end=mid-1;
        }
       

       }
       if (c>0){
        System.out.println("items found at" +mid +" Postion");
    }else{
        System.out.println("item not found");
    }
    }
}
