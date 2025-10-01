package arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 6, 7, 8};
        int[] arr2 = {1, 4, 6, 7, 8};
        System.out.println(sorted(arr1, 0));
        System.out.println(sorted(arr2, 0));

    }

    static boolean sorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index]< arr[index+1] && sorted(arr, index+1);

    }
}
