package easy;

public class fibNumber {
    public static void main(String[] args) {
        int fibNumber = fib(5);
        System.out.println(5);
    }

    static int fib(int n){
        if(n<2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
