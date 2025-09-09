package org.example;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        printNumber(1);
    }

    static void printNumber(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
