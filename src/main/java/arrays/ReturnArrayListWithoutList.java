package arrays;

import java.util.ArrayList;

public class ReturnArrayListWithoutList {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 87, 65, 4, 14, 11, 10};
        int target = 10;
        System.out.println(findAllIndex(arr, target, 0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(target== arr[index]){
            list.add(index);
        }
        ArrayList<Integer> indexBelowList = findAllIndex(arr, target, index+1);
        list.addAll(indexBelowList);
        return list;
    }
}

