// Function Overloading is two or more functions existing with same name but different parameters;

public class Overloading {
    public static void main(String[] args){
        func(10);
        func("Rohan");
        func(true);
    }    
    static void func(int a){
        System.out.println(a);
    }
    static void func(String b){
        System.out.println("Hello "+b);
    }
    static void func(boolean c){
        System.out.println(c);
    }
}
