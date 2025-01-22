package LinearSearch;

public class Main {
    public static void main(String[] args){
        int arr[] = {34, 32, 12, 15, 26};
        int num = 15;
        System.out.println("Target element is at index " + findNum(arr, num));
    }   
    static int findNum(int[] arr, int num){

        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                return i;
            }
        }

        return -1;
    } 
}
