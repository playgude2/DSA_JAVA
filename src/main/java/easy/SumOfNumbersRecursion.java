package easy;

public class SumOfNumbersRecursion {
    public static void main(String[] args) {
        System.out.println(sumNumbers(1340212));
    }

    static int sumNumbers(int n){
        if(n == 0){
            return 0;
        }
        return sumNumbers(n/10) + n%10;
    }
}
