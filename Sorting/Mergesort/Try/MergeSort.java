public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1]; // Temporary array for merging
        int idx1 = si; // Starting index for left subarray
        int idx2 = mid + 1; // Starting index for right subarray
        int x = 0; // Index for the merged array

        // Merge elements from both subarrays
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        // Add remaining elements from the left subarray
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        // Add remaining elements from the right subarray
        while (idx2 <= ei) {
            merge[x++] = arr[idx2++];
        }

        // Copy the merged elements back to the original array
        for (int i = 0; i < merge.length; i++) {
            arr[si + i] = merge[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // Calculate the midpoint
        divide(arr, si, mid); // Recursively divide the left subarray
        divide(arr, mid + 1, ei); // Recursively divide the right subarray
        conquer(arr, si, mid, ei); // Merge the two subarrays
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, 7};
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
