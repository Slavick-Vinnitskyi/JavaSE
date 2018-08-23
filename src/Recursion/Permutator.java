package Recursion;

import java.util.Arrays;

public class Permutator {
    private static int k = 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,7};
        permute(arr, arr.length);
    }
    private static void permute(int[] arr, int size) {

        if(size < 2) {
            k += 1;
            System.out.println(k + " " + Arrays.toString(arr));

        } else {
            for(int i = 0; i < size; i++) {
                swap(arr, i,size - 1);
                permute(arr,size - 1);
                swap(arr, i,size - 1);
            }
        }
    }
    private static void swap(int [] arr,int index0,int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }

}
