package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123456789;
        int ans = reverse(num);
        System.out.println(ans);
    }

    /* Method 1 using outside variable */
    static int mh = 0;

    private static int reverse(int num) {
        if (num == 0) {
            return 1;
        }
        int hm = num % 10;
        mh = mh * 10 + hm;
        reverse(num / 10);

        return mh;
    }
}
