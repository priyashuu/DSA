public class PolynomialAddition {

    // Function to add two polynomials
    public static int[] addPolynomials(int[] poly1, int[] poly2) {
        // Determine the maximum length of the two polynomials
        int maxLength = Math.max(poly1.length, poly2.length);

        // Create a result array with the maximum length
        int[] result = new int[maxLength];

        // Add coefficients from the first polynomial
        for (int i = 0; i < poly1.length; i++) {
            result[i] += poly1[i];
        }

        // Add coefficients from the second polynomial
        for (int i = 0; i < poly2.length; i++) {
            result[i] += poly2[i];
        }

        return result;
    }

    // Function to display a polynomial
    public static void displayPolynomial(int[] poly) {
        for (int i = poly.length - 1; i >= 0; i--) {
            if (poly[i] != 0) {
                System.out.print(poly[i] + "x^" + i);
                if (i != 0) {
                    System.out.print(" + ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Polynomial 1: 5x^2 + 4x^1 + 2x^0
        int[] poly1 = {2, 4, 5}; // Coefficients for x^0, x^1, x^2

        // Polynomial 2:  
        int[] poly2 = {1,7, 3}; // 

        // Add the polynomials
        int[] result = addPolynomials(poly1, poly2);

        // Display the result
        System.out.print("Polynomial 1: ");
        displayPolynomial(poly1);

        System.out.print("Polynomial 2: ");
        displayPolynomial(poly2);

        System.out.print("Result: ");
        displayPolynomial(result);
    }
}