public class IndexedSearch {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] index = { 0, 3, 6 };
        int key = 90;

        int block = -1;
        // find the block where key is present 
        for (int i = 0; i < index.length; i++) { // iterate through the index array
            if (i == index.length - 1 || key < arr[index[i + 1]]) { //
                block = i;
                break;
            }
        }
        
       
        if (block != -1) { // if block is found then search in that block only else key is not present in the array 
            for (int i = index[block]; i < arr.length && i < index[block] + 3; i++) {
                if (arr[i] == key) {
                    System.out.println("Key found at position: " + i);
                    return;
                }
            }
        }

        System.out.println("Key not found.");
    }
}
