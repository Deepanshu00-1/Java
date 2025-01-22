package questions;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            // take the operator as input
            System.out.print("Enter operator to perform operation accordingly ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Now enter two numbers to perform calculation");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    System.out.println("Addition: " + (num1 + num2));
                }
                else if(op == '-'){
                    System.out.println("Subtraction: " + (num1 - num2));
                }
                else if(op == '*'){
                    System.out.println("multiplication: " + (num1 * num2));
                }
                else if(op == '/'){
                    System.out.println("Division: " + (num1 / num2));
                }
                else{
                    System.out.println("Remainder: " + (num1 % num2));
                }
            }
        }
    }
}
