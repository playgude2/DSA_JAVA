package easy;

public class RevNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1324, 0));
    }

    static int reverseNumber(int n, int rev){
        if(n==0){
            return rev;
        }

        return reverseNumber(n/10, rev * 10 + n % 10);
    }
}
