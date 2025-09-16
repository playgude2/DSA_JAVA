package easy;

public class ReverseNumberRecursion {
    static int sum = 0;
    static void reverseNum2(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverseNum2(n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverseNum1(43521, 0));
        reverseNum2(2314);
        System.out.println(sum);
    }
    static int reverseNum1(int n, int rev){
        if(n == 0){
            return rev;
        }
        return reverseNum1(n/10, rev*10 + n%10);
    }


}
