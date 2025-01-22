package LinearSearch;

public class Odd {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("The count of odd numbers present in array is " + odd(arr));
        System.out.println("The odd numbers present in array are: " + oddNumbers(arr));
    }
    static int odd(int arr[]){
        if(arr.length == 0){
            return -1;
        }
        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]%2 !=0){
                count++;
            }
        }

        return count;
    }
    static int[] oddNumbers(int arr[]){

        int oddNumbers[] ={};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                for(int j=0; j<arr.length-1; j++){
                    arr[i] = oddNumbers[j];
                }
            }
        }
        return oddNumbers;
    }
}
