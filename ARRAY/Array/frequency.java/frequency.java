
public class frequency {
    public static void main(String[] args) {
        int [] arr ={1,2,3,3,3,2};
        int element=2;
        int frequency=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==element){
                frequency++;
            }
        }
        System.out.println(frequency);
        
    }
    
}
