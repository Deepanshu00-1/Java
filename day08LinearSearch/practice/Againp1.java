public class Againp1 {
    public static void main(String[] args){
        int[] arr = {1, 4, 2, 5, 12, 32, 0};
        System.out.println("Min: " + min(arr));
        System.out.println("Max: " + max(arr));
    }
    static int min(int[] arr){
        int num = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<num){
                num = arr[i];
            }
        }
        return num;
    }
    static int max(int[] arr){
        int num = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>num){
                num=arr[i];
            }
        }
        return num;
    }
}
