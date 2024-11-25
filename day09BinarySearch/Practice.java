package day09BinarySearch;

public class Practice {
    public static void main(String[] args){
        int[] arr = {12, 14, 20, 25, 30, 40, 55, 60, 70};
        int target = 30;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target> arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
