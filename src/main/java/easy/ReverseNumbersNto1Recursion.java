package easy;

public class ReverseNumbersNto1Recursion {
    public static void main(String[] args) {
        Nto1(5);
    }
    static void Nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }
}
