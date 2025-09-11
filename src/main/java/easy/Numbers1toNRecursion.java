package easy;

public class Numbers1toNRecursion {
    public static void main(String[] args) {
        Num1toN(5);
    }

    static void Num1toN(int n){
        if(n==0){
            return;
        }
        Num1toN(n-1);
        System.out.println(n);
    }
}
