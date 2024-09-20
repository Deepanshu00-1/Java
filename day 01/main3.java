import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        int age = 22;
        String name = "Rohan";
        System.out.println("Hello "+name+" ,You are "+age+" years old" );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your new name");
        String newName = scanner.nextLine();

        System.out.println("Your new name is "+newName );

        System.out.println("Enter your new age");
        int newAge = scanner.nextInt();

        System.out.println("your new age is "+ newAge);

        scanner.nextLine();

        System.out.println("Enter your lastname");
        String lastName = scanner.nextLine();

        System.out.println("Your lastname is "+ lastName);
    }
}
