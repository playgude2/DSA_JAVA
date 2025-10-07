package patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,8,2,9};
        selectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r, int c, int maxIndex){
        if(r==0){
            return;
        }

        if (c < r) {
            if (arr[c]>arr[maxIndex]){
                int temp = arr[c];
                arr[c] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
            selectionSort(arr, r, c + 1, maxIndex);
        }
        else{
            selectionSort(arr, r-1, 0, maxIndex);
        }
    }
}
