
class Main {
    public static void main(String[] args) {

        int a[] = { 6, 6, 5, 3, 2, 1, 9 };
        int i;
        int n = a.length;
        buildheap(a, n);
        System.out.println("");
        // print the heap
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        heapsort(a, n);
        System.out.println("");
        // print the sorted array
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void buildheap(int a[], int n) {
        for (int i = (n - 2); i >= 0; i--)
            heapify(a, n, i);
    }

    static void heapify(int a[], int n, int i) {
        int root = i;
        int right = 2 * i + 1; //
        int left = 2 * i;
        if (left < n && a[left] > a[root])
            root = left;
        if (right < n && a[right] > a[root])
            root = right;
        if (root != i) {
            int c = a[root]; //
            a[root] = a[i];
            a[i] = c;
            heapify(a, n, root);
        }
    }

    static void heapsort(int a[], int n) {

        while (n > 0) {
            int t = a[n - 1];
            a[n - 1] = a[0];
            a[0] = t;
            n = n - 1;
            heapify(a, n, 0);
        }
    }
}
