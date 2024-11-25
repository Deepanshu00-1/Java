import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers;
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {23, 12, 45, 32, 50};

        int[] ros; // declaration of array.ros is getting defined in the stack
        ros = new int[5]; //actually here object is being created in the memory(heap) 

        String[] arr = new String[4];
        //  System.out.println(arr[0]);

        // Array of primitives
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;
        // {1,2,3,4,5}
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[6];

        // input using for loops
        // for(int i = 0; i<arr3.length; i++){
        //     arr3[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr3));
        // for (int i=0; i<arr3.length; i++){
        //     System.out.println(arr3[i] + "");
        // }
        // enhanced for loop
        // for(int num : arr3){ // for every element in the array, print the element
        //     System.out.print(num + " "); // here num represents elements of the array
        // }
        // System.out.println(arr3[6]);

        // Array of objects
        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
