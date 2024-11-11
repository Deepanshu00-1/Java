import java.util.Scanner;

public class function {
    public static void main(String[] args){
        twoSum();
    }
    static void twoSum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:");
        num1 = in.nextInt();
        System.out.println("Enter num2:"); 
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("sum of num1, num2 is: "+sum);
    }
    
}
