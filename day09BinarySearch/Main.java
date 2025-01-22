package day09BinarySearch;

public class Main {
    public static void main(String[] args){
        int[] arr = {2, 4, 5, 6, 8, 12, 43, 56, 67};
        int target = 56;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }   
    // return the index
    // return -1 if it does not exist
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; //start+end is a problem,, because int has a fixed size after some amount of value you cannot put a value in an integer
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            } else if(target>arr[mid]){
                start = mid +1;
            }else{
                // answer found
                return mid;
            }
        }
        return -1;
    }
}    
