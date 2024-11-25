package day09BinarySearch;

public class Practice2 {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 34, 23, 55, 67, 56};
        int target = 67;
        System.out.println(BinarySearch(arr, target));
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean Asc = arr[end] > arr[start];
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(Asc){
                if(target>arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target> arr[mid]){
                    start = mid +1;
                }else{
                    end = mid +1;
                }
            }
        }
        return -1;
    }
}
