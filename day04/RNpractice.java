package day04;
import java.util.Random;

public class RNpractice {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(3)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println("Random int: "+x+ " ,Random double: "+y+" ,Random boolean: "+z);
    }
}
