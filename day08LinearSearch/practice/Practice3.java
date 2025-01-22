package practice;

public class Practice3 {
    // count even and odd numbers in array
    public static void main(String[] args){
        int[] arr = {21, 22, 23, 24, 25, 26, 27, 28};
        System.out.println("The count of even numbers present in array is "+ EvenNums(arr));
        System.out.println("The count of odd numbers present in array is "+ OddNums(arr));
    }
    static int EvenNums(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        // int[] evenNum = {};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
                // arr[i] = evenNum;
            }
        }
        return count;
    }
    static int OddNums(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
}
