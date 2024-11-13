public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        {
            // int a = 6; //pre initialised but we can modify it
            a = 6; // like this
            int c = 23;
        }
        //System.out.println(c); //cannot use outside the block
        System.out.println(a);
    }

    // Anything that is outside the block can be modified and used inside a block but cannot be re-initialised
    // Anything that is inside the block neither can be used nor be modified.

    static void random(){
        //Function scope
        // System.out.println(a);
    }
}
