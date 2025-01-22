import java.util.Arrays;
// Variable arguments: when we do not know many inputs we are giving.

public class VarArg {
    public static void main(String[] args){
        fun(2, 3, 4, 5, 56, 76, 45, 35);
    }
    // One more main thing is when we pass arguments, they should be in same order as parameter, like if a parameter is int a, int b, String c. Then the argument should be number, number, string.
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
