import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        /*
        Syntax of for loops:
        
        for(initialisation; condition; increament/decreament;){
            //body
        }
        */
        // Q. print numbers from 1 to 5
        for(int num=1; num<=5; num++){
            System.out.println(num);
        }
        boolean value = false;
        while(value == true){
            System.out.println("no");
        }

        // while loop

        Scanner in = new Scanner(System.in);
        int answer;
        System.out.println("Hello there solve this easy question: 3*2=?, Please make sure your answer is correct other wise i will be stuck in a loop!");
        answer = in.nextInt();
        while(answer != 6){
            System.out.println("Oh no your answer was wrong, now i am in a loop");
        }
        System.out.println("Great your answer was correct");

        // do while loop
        /*
        do{
        
        } while(condition);
        */
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while (n<=5);
    }
}
