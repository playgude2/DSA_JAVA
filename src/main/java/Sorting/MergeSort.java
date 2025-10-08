package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }

    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays)

    }
}
