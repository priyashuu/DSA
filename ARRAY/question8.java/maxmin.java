

public class maxmin {
  public static void main(String[] args) {
    int [] a= {10,8,2,5,1,6,9};
    int max = a[0];
    int min =a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
  }  
}
