
public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Check if multiplication is possible
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Result matrix
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i< rows1 ; i++) {
            for (int  j=0 ; j<cols2 ; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
