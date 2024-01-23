package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 5, 9, 12, 15, 18, 23, 25, 29, 33, 35, 50 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int key = 23;
        int ans = -1;
        ans = bsearch(arr, key, start, end);
        System.out.println(ans);
    }

    static int bsearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            start = mid + 1;
            return bsearch(arr, key, start, end);
        }
        end = mid - 1;
        return bsearch(arr, key, start, end);
    }
}
