import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args){
        /* 
        1 2 3
        4 5 6
        7 8 9
        */
        Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][3]; // adding rows is mandatory but columns are not
        // Hard way to store
        // int[][]arr2 = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9},
        // };
        int[][] arr2D = { // here it won't give error because number of columns can be different like in this
            {1, 2, 3}, //0th index
            {4, 5}, // 1st index
            {6, 7, 8, 9}, // 2nd index -> arr2D = {6, 7, 8, 9}
        };
        
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        // Input
        for(int row = 0; row < arr.length; row++){
            // for each col in every row
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt(); 
            }
        }
        // Output
        // for(int row = 0; row < arr.length; row++){
        //     // for each col in every row
        //     for(int col = 0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col]+ " "); 
        //     }
        //     System.out.println("");
        // }

        // Output
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        // Enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
