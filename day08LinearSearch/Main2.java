public class Main2 {
    // Q.. FInd an element in an array
    public static void main(String[] args){
        int[] nums = {2, 67, 43, 23, 54, 12, 334, 14, 940};
        int target = 12;
        System.out.println(FindNum(nums, target));
        System.out.println("The minimum value present in array is "+ FindMin(nums));
        System.out.println("The maximum value present in array is "+ FindMax(nums));
        System.out.println("Count of even numbers present in given array is "+ FindEvenNum(nums));
    }
    static int FindNum(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index<arr.length; index++ ){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int FindMin(int[] arr){
        int num1 = arr[0];
        for(int index = 0; index<arr.length; index++){
            if(arr[index]<num1){
                num1 = arr[index];
            }
        }
        return num1;
    }
    static int FindMax(int[] arr){
        int num1 = arr[0];
        for(int index = 0; index<arr.length; index++){
            if(arr[index]>num1){
                num1 = arr[index];
            }
        }
        return num1;
    }
    static int FindEvenNum(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 10 == 0){
                count++;
            }
        }
        return count;
    }
}