package org.example;

public class PrintNumber {
    public static void main(String[] args) {
//        System.out.println(printNum(5));
        printReverserNum(5);
        printNum(1);


    }


    static void printReverserNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printReverserNum(n-1);
    }

    static void printNum(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
}
