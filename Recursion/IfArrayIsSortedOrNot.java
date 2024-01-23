package Recursion;

public class IfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 7, 8 };
        int i = 0, j = 1;
        System.out.println(sortedornot(arr, i, j));
    }

    private static boolean sortedornot(int[] arr, int i, int j) {
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[j] && sortedornot(arr, ++i, ++j);
    }
}
