import java.util.Scanner;

// Shadowing: it is a practice of using two variables with same name within the scope that overlaps

public class Shadowing {
    static int x = 10;
    public static void main(String[] args){
        System.out.println(x); // 10
        int x = 20;
        System.out.println(x); // 20
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
