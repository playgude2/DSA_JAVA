package easy;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }

    static int product(int n){
        if(n<=1){
            return 1;
        }
        return product(n/10) * (n%10);
    }
}
