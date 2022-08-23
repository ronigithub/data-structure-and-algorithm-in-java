package SearchingAlgorithoms;

public class LinerSearch {

    public static int search(int[] arr, int value) {

        for (int i=0; i<arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 11, 12};

        System.out.println("position: " + LinerSearch.search(arr, 12));
    }
}
