package practice;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args){
        int[][] arr = new int[][]{
            {12, 2, 3},
            {4, 5, 6},
            {7, 898, 99}
        };
        System.out.println("The min number in given 2D array is " + FindMin(arr));
    }
    static int FindMin(int[][] arr){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                int num = arr[0][0];
                if(num>arr[r][c]){
                    num = arr[r][c];
                    return arr[r][c];
                }   
            }
        }
        return arr[-1][-1];
    }
}
