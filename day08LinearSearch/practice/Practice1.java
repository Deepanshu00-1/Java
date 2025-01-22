package practice;

public class Practice1 {
    // simple linear search, finding num in given array
    public static void main(String[] args){
        int[] arr = {1, 2, 7, 12, 15, 54, 32, 43, 564};
        int target = 54;
        System.out.println(target+" is present at index "+ FindNum(arr, target) +" in given array");
    }
    static int FindNum(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
