

public class avgArray {
    public static void main(String[] args) {
        int sum;
        int [] a = {1,2,3};
        sum=0;
        for (int i=0 ; i < a.length;i++)
{
sum =a[i] + sum;
}
System.out.println(sum);  
int avg =sum/a.length;
System.out.println(avg);
}
    
}
