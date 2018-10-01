package Loops;

public class ArraySum {
    private int array[] = {5,7,3,1,4,6,7};
    public void setArray(int[] array) {
        this.array = array;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int[] getArray() {
        return array;
    }

    public int getSum() {
        return sum;
    }

    private int sum = 14;
    private boolean sumOfTwoElements(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1;j < arr.length; j++) {
                 if(arr[i] + arr[j] == sum) {
                    System.out.print(i + " " + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        boolean b = arraySum.sumOfTwoElements(arraySum.array,arraySum.sum);
        System.out.println("\n" + b);
    }
}
