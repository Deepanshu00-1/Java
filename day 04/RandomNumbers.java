package day04;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random(); // not true random numbers, but pseudo random numbers
        // int x = random.nextInt(6)+1;
        // double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z); // prints random number between -2billion to 2billion

    }
}
