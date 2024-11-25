import java.util.Arrays;
public class Sorted {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3,},
            {5, 6, 7, 8},
            {9, 11, 12},
            {15,16}
        };
        int target = 15;
        System.out.println("The index of target is " + Arrays.toString(FindNum(arr, target)));
    }
    static int[] FindNum(int[][] arr, int target){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(arr[r][c]==target){
                    return new int[]{r, c};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
