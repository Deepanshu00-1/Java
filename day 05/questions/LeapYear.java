package questions;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year to check whether it is leap year or not");
        int year = in.nextInt();
        if(year % 4 == 0 && year % 10 != 0 || year % 400 ==0){
            System.out.println("given year is a leap year");
        }
        else{
            System.out.println("given year is not leap year");
        }
    }
}
