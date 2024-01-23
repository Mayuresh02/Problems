package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 23, 25, 26, 21, 22, 27 };
        int key = 20;
        int index = 0;
        System.out.println(search(arr, key, index));
    }

    static int search(int[] arr, int key, int index) {
        if (index > arr.length - 1) {
            return -1;
        }

        // if (arr[index] == key) {
        // return index + 1;
        // }
      
        return arr[index] == key ? index + 1 : search(arr, key, ++index);
    }
}
