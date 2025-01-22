package LinearSearch;

public class Min {
    public static void main(String[] args){
        int arr[] = {23, 21, 12, 5, 50, 32};
        System.out.println("The min number in given array is " + min(arr));
    }
    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int num = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=num){
                num = arr[i];
            }
        }
        return num;
        
    }
}
