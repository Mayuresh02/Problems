package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int num = 123456789;
        int ans = digitSum(num);
        int anm = digitProduct(num);
        System.out.println(ans + " " + anm);
    }

    private static int digitSum(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + digitSum(num / 10);
    }

    private static int digitProduct(int num) {
        if (num == 0) {
            return 1;
        }
        return (num % 10) * digitProduct(num / 10);
    }
}
