import java.util.Scanner;

public class Main4{
    public static void main(String[] args){
        System.out.println("Hello, Do you like writing code in JAVA?");
        Scanner scanner = new Scanner(System.in);
        String Answer = scanner.nextLine();
        if(Answer == "yes"){
            System.out.println("Great!, Let's begin with it then...");
        }
        else{
            System.out.println("Oh!, You can explore other programming languages...");
        }
    }
}
