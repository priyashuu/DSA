
public class InsertionSort {
    public static void main(String[] args) {
        int [] a={13,16,10,11,4,12,6,7};
        int i,temp,j;
        for(i =1;i<a.length;i++){
            temp=a[i];
            j=i-1;
            while(j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
        for (i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
   
}
