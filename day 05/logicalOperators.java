public class logicalOperators {
    public static void main(String[] args){
        int number = 12;
        int number2 = 6;
        if(number/6 == 2 && number2/6 == 1 ){
            System.out.println("Both conditions are true");
        }
        int number3 = 10;
        if(number/6 == 3 || number3/5 == 2){
            System.out.println("One Condition is true");
        }
        Boolean Value = true;
        System.out.println(!Value);
    }
}
