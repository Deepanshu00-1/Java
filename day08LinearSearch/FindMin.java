public class FindMin {
    public static void main(String[] args){
        int[] arr = {1, 7, 3, -1, 10};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr){
        int ans = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
