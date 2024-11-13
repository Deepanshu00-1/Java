package questions;

// public class CountingOcc {
//     // Counting occurances
//     public static void main(String[] args){
//         int n = 43336;

//         int count = 0;
//         while(n > 0){
//             int rem = n % 10;
//             if(rem == 3){
//                 count++;
//             }
//             n = n / 10; // n /= 10
//         }
//         System.out.println(count);
//     }
// }

import java.util.Scanner;

public class CountingOcc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number with repeating values: ");
        int num = in.nextInt();
        System.out.print("Enter the repeating value to check their occurance ");
        int repeatValue = in.nextInt();
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == repeatValue){
                count++;
            }
            num = num/10;
        }
        System.out.print("Occurance of "+repeatValue+" is "+ count);
    }
}















