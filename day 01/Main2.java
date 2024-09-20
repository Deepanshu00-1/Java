// int x; //declaration

// x = 123; // assignment

// // initialization
// int x = 123;

public class Main2 {

    public static void main(String[] args) {
        String x = "Hello";
        String y = "Rohan";
        String temp;

        System.out.println("x before: " + x);
        System.out.println("y before: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x after: " + x);
        System.out.println("y after: " + y);

    }

}