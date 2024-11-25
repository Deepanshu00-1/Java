package day09BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args){
        int[] arr= {-18, 45, -4, 0, 2, 3, 4, 15, 22, 2, 45, 89};
        int target = 22;
        int ans = orderAgnostics(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostics(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; //start+end is a problem,, because int has a fixed size after some amount of value you cannot put a value in an integer
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
