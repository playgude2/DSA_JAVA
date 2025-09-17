package easy;

public class ProductNumbersRecursion {
    public static void main(String[] args) {
        System.out.println(productNum(124320));
    }

    static int productNum(int n){
        if(n <= 1){
            return 1;
        }
        return productNum(n/10)*(n%10);
    }
}
