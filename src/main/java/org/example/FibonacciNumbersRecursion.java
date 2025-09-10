package org.example;

public class FibonacciNumbersRecursion {
    public static void main(String[] args) {
        int numberSeries = fibonacciNumbers(5);
        System.out.println(numberSeries);

    }

    static int fibonacciNumbers(int n){

        if(n<2){
            return n;
        }
        return fibonacciNumbers(n-1) + fibonacciNumbers(n-2);
    }
}
