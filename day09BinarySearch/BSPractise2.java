public class BSPractise2{
    public static void main(String[] args){
        int arr[] = {12, 21, 31, 42, 55, 65, 77};
        int target = 65;
        System.out.println("The target element is at index: " + BinarySearch(arr, target));
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}