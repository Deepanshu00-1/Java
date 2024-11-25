import java.util.Scanner;

public class function {
    public static void main(String[] args){
        int sum = twoSum();
        System.out.println("sum is "+sum);

        String message = greet();
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two arguments(numbers) for addition");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = sum3(a, b);
        System.out.println(ans);

        String msg = hello();
        System.out.println(msg);
    }
    
    // Return type int
    static int twoSum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:");
        num1 = in.nextInt();
        System.out.print("Enter num2:"); 
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    // Return type String
    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
    
    // Using Parameters
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static String hello(){
        System.out.println("Hello rohan");
        String msg="ok";
        return msg;
    }
    
}
