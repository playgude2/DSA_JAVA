package easy;
public class ReverseNumber {
    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int num = 342132;
        System.out.println("Reversed: " + reverse(num, 0)); // Output: 1243

    }
}
