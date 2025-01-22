// import java.util.Math;

public class sqrRoot {
    public static void main(String[] args) {
        // int sqrRoot = (int) Math.sqrt(25);
        // System.out.println(sqrRoot);
        int ages[] = { 25, 10, 17, 16, 82 };
        int count = 0;

        for (int i = 0; i < ages.length; i++) {
            int sqrRoot = (int) Math.sqrt(ages[i]);
            if (sqrRoot * sqrRoot == ages[i]) {
                count++;
            }
        }
        System.out.println(count);

    }

}
