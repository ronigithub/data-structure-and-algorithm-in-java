package SearchingAlgorithoms;

public class BinarySearch {

    public static int search(int[] arr, int value) {

        int start = 0;
        int end = arr.length - 1;
        int middle = start + (end - start)/2;
        System.out.println(start + " " + middle + " "+ end);
        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

            middle = start + (end - start)/2;
            System.out.println(start + " " + middle + " "+ end);
        }

        if (arr[middle] == value) {
            return middle;
        }

        return -1;
    }

    public static void main(String[] arg) {
        int[] arr = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        for (int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        int result = BinarySearch.search(arr, 10);
        System.out.println( result == -1 ? "Not found" : "find at index: " + result);
    }
}
