
public class SprialMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        while (top<=bottom && left<=right) {
            // Print top row left to right
            for (int i = left; i<=right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // Print right column top to bottom
            for (int i = top; i<=bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            // Print bottom row right to left
            if (top<=bottom) {
                for (int i = right; i>=left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
        // Print left column bottom to top
            if (left<=right) {
                for (int i = bottom; i>=top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    

}
