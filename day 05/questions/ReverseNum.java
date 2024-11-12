package questions;

// public class ReverseNum {
//     public static void main(String[] args){
//         // Reverse a number n = 23597
//         int num = 1234;

//         int ans = 0;

//         while (num > 0){
//             int rem = num % 10;
//             num = num/10;
//             ans = ans * 10 + rem;
//         }
//         System.out.println(ans);
//     }
// }



import java.util.Scanner;

public class ReverseNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number with few digits to reverse it: ");
        int num = in.nextInt();
        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            num = num /10;
            ans = ans*10 + rem;
        }
        System.out.println("reversed number is " + ans);
    }
}
















