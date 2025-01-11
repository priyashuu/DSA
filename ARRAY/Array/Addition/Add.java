import java.util.*;
public class Add {
    public static void main(String[] args) {
        int [] [] arr1 ={{1,2},{3,4}};
        int [] [] arr2 ={{1,2},{3,4}};
        int rows=arr1.length;
        int cols =arr1[0].length;
        int [] [] add= new int [rows][cols];
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[0].length;j++){
                add[i][j] =arr1[i][j]+arr2[i][j];
            }
           
        }
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
