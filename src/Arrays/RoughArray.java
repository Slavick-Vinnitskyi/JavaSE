package Arrays;

public class RoughArray {
    public static void main(String[] args) {
        int [][] arr = createRoughArray(10);
        for(int[] row : arr){
            for(int el :row) {
                System.out.printf("%4d",el);
            }
            System.out.println();
        }
    }

    private static int[][] createRoughArray(int n) {
        int[][] array = new int[n+1][];
        for(int i = 0; i <= n; i++){
            array[i] = new int[i+1];
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = 0 ; j < array[i].length; j++){
                int num = 1;
                for(int k = 1; k < j; k++) {
                    num = num * (i - k + 1) / k;
                }
                array[i][j] = num;
            }
        }
        return array;
    }
}
