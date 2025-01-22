public class SwapNumber {
    public static void main(String[] args){
        // int a = 10;
        // int b = 20;

        // swap(a, b);
        // System.out.println(a + " " + b);

        // // String name = "Deepanshu";
        // String name = "Rohan";
        // changeName(name);
        String name = "Rohan";
        String nameNew = changeName2(name);
        System.out.println(nameNew);
        System.out.println(name);
        
    }
    // Here if we change parameter name, then it doesn't make difference if parameter or argument variables names are same or not, in JAVA methods values are passed not refferences
    static String changeName2(String newName){
        newName = "Deepanshu";
        return newName;
    }


    static void changeName(String naam){
        System.out.println(naam);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

