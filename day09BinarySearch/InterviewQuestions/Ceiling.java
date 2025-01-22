package InterviewQuestions;

// ques1: ceiling of a number
// given an array [2, 3, 5, 9, 14, 16, 18], target = 15
// ceiling means, in this array find the smallest number i.e. greater or equal to target element 

public class Ceiling{
    // here this q similer to eimple binary search and 
    // but in this one if you don't get element instead of returning -1, return just greater element.
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }
    // return the index of smalled no >=target
    static int ceiling(int[] arr, int target){
        // but what if the target is greater than the greatest number in the array


        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }

        return start;
    }
}
