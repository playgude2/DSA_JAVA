package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 34, 12, 76, 9};
        int target = 122;
        System.out.println(linearSearch(arr1, target, 0));
        System.out.println(linearSearchIndex(arr1, target, 0));

    }

    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return linearSearch(arr, target, index+1);
    }

    static int linearSearchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return linearSearchIndex(arr, target, index+1);
        }
    }
}
