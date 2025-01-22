package questions;
import java.util.Scanner;

public class Sign {
    // check whether a number is positive, negative or zero
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is +, -, 0");
        int num = in.nextInt();
        if(num>0){
            System.out.println("Number is Positive(+)");
        }
        else if(num<0){
            System.out.println("Number is Negative(-)");
        }
        else{
            System.out.println("Number is Zero(0)");
        }
    }
}
