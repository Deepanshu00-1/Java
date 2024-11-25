package practice;
import java.util.Arrays;

public class FindNum {
    // find num in 2D array
    public static void main(String[] args){
        int[][] arr = new int[][]{
            {1 ,2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 9;
        System.out.println("The target element is present at index " + Arrays.toString(FindNum(arr, target)));
    }
    static int[] FindNum(int[][] arr, int target){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(arr[r][c] == target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
