public class MergeSort {

    // Method to perform merge sort on an array
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;  // Base case: if the array has less than 2 elements, it's already sorted

        int mid = arr.length / 2; // Find the middle index
        int[] left = new int[mid]; // Create an array for the left half
        int[] right = new int[arr.length - mid]; // Create an array for the right half

        // Copy elements to left and right sub-arrays
        System.arraycopy(arr, 0, left, 0, mid); // Copy elements from arr to left
        System.arraycopy(arr, mid, right, 0, arr.length - mid); // Copy remaining elements from arr to right

        // Recursively sort both sub-arrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted sub-arrays into the original array
        merge(arr, left, right);
    }

    // Method to merge two sorted arrays (left and right) into the original array (arr)
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0; // i for left array, j for right array, k for merged array

        // Compare elements from both arrays (left and right) and insert the smaller one into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++]; // If left[i] is smaller or equal, insert it into arr
            } else {
                arr[k++] = right[j++]; // If right[j] is smaller, insert it into arr
            }
        }

        // If any elements are left in the left array, add them to arr
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // If any elements are left in the right array, add them to arr
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test merge sort
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Initialize the array

        System.out.println("Original Array:");
        printArray(arr); // Print the original array

        mergeSort(arr); // Sort the array using merge sort

        System.out.println("Sorted Array:");
        printArray(arr); // Print the sorted array
    }
}
