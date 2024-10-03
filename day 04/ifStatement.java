package day04;

public class ifStatement {
    public static void main(String[] args){
        int x = 1;
        if(x>5 && x<15){
            System.out.println("X lies between 5 and 15");
        }else{
            System.out.println("X doesn't between 5 and 15");
        }

        int age = 75;
        if(age == 75){
            System.out.println("Boomer!");
        }else if(age>=18){
            System.out.println("You are an adult!");
        }else if(age<=18){
            System.out.println("You are a teenager!");
        }else{
            System.out.println("You are a gramps!");
        }
    }
}
