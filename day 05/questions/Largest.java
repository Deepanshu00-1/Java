package questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){

        // Q: Find the largest of the 3 numbers

        // Approach1

        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int a = in.nextInt();
        System.out.println("Enter num2: ");
        int b = in.nextInt();
        System.out.println("Enter num3: ");
        int c = in.nextInt();

        if(a>b && a>c){
            System.out.println("num1 is greatest among them.");
        }else if(b>a && b>c){
            System.out.println("num2 is greatest among them.");
        }else{
            System.out.println("num3 is greatest among them.");
        }

        // Approach2
        System.out.println("Now let's see second approach");

        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();

        int max = d;
        if(e>max){
            max = e;
        }
        if(f>max){
            max = f;
        }
        System.out.println(max);
    }
}
