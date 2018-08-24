package Arrays;

import java.util.Arrays;

public class ReverseBubble {
    public static void main(String[] args) {
        int [] arr = {111, 2, 5, 0, 9, 6 };
        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if(arr[j ] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        long end = System.nanoTime();
        double time = ((end - start) * Math.pow(10,-9));
        System.out.println(Arrays.toString(arr) +  " Time :" + time);

    }



}
