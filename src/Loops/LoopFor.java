package Loops;

import java.util.Arrays;

public class LoopFor {
    public static void main(String[] args) {
        int[] array = {3,5,13,459,2,56,45,24};
        System.out.println("Array : " + Arrays.toString(array) + "\n" + "Max element : " + getMax(array));
        System.out.println("Max element : " + getMax_foreach(array));
    }
    private static int getMax(int [] arr) {
        int max = arr[0];
        for(int i =0; i < arr.length;i++) {
          if(arr[i] > max) {
              max = arr[i];
          }
        }
        return max;
    }
    private static int getMax_foreach(int [] arr) {
        int max = arr[0];
        for (int anArr : arr) {
            if (anArr > max) {
                max = anArr;
            }
        }
        return max;
    }
}
