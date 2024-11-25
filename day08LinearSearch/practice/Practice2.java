package practice;

public class Practice2 {
    // finding min and max num in array
    public static void main(String[] args){
        int[] arr = {23, 43, 32, 54, 66, 100, 1, 45};
        System.out.println("The minimum number in given array is "+ FindMin(arr));
        System.out.println("The maximum number in given array is "+ FindMax(arr));
    }
    static int FindMin(int[] arr){
        if(arr.length ==0){
            return -1;
        }
        int num = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<num){
                num = arr[i];
            }
        }
        return num;
    }
    static int FindMax(int[] arr){
        if(arr.length ==0){
            return -1;
        }
        int num = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
}
