/*
- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
- You may assume that each input would have exactly one solution, and you may not use the same element twice.
- You can return the answer in any order.
*/
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {11, 7, 2, 15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum(nums, target)));
    }    
    static int[] TwoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; i++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[]{-1, -1};
    }
}
