package LinearSearch;

public class Max {
    public static void main(String[] args){
        int arr[] = {1, 12, 21, 23, 45, 11};
        System.out.println("The max number in array is " + max(arr));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int num = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>=num){
                num = arr[i];
            }
        }

        return num;
    }
}
