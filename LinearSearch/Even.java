package LinearSearch;

public class Even {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("The count of even numbers present in array is " + even(arr));
    }
    static int even(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
}
