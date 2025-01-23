import java.util.Arrays;

public class BSPractise {
    public static void main(String[] args){
        int arr[] = {8, 4, 5, 2, 7, 11, 10};
        BubbleSort(arr);
        System.out.println("Array is sorted by bubble sort method: " + Arrays.toString(arr));
    }    
    static void BubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
