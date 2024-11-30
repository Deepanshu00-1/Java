import java.util.Scanner;

public class Day01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 11000/60 && n <= 58900/60){
            System.out.println(1);
        }else if(n >= 1000/60 && n<= 11000/60){
            System.out.println(0);
        }else if(n == 1){
            System.out.println(2);
        }else{
            System.out.println(-1);
        }
    }
}
