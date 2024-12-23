import java.util.*;
public class MergedArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] arr1={5,6,7,8,9};
        int [] mergeArrays=new int [arr.length+arr.length];
        System.arraycopy(arr, 0, mergeArrays,0,arr.length);
        System.arraycopy(arr1, 0, mergeArrays, arr.length, arr1.length);
        
            System.out.println("MergedArrays" + Arrays.toString(mergeArrays));
        
    }
}
