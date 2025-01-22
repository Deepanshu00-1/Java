package questions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is odd or even");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
