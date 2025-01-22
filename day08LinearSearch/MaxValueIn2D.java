import java.util.Arrays;

public class MaxValueIn2D {
    public static void main(String[] args){
        int[][] arr = new int[][]{
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        // int target = 56;
        int[] ans = max(arr); //format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
