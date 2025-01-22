package InterviewQuestions.QuessameasCeiling;

import java.util.Arrays;
import java.util.Scanner;

public class ques {
    // leetcode:744 - Find Smallest letter Greater Than Target
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Print array length to create a array further... ");
        int arrLength = in.nextInt();
        char[] letters = new char[arrLength];
        System.out.println("Now print characters one by one to store in array: ");
        for(int i=0; i<arrLength; i++){
            letters[i] = in.next().charAt(0);
        }
        System.out.println("your char letters are: " + Arrays.toString(letters));
        System.out.println("Now print target so that we could find smallest letter greater than target");
        char target = in.next().charAt(0);
        System.out.println(func(letters, target));
    }
    static char func(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        if(target> letters[letters.length-1]){
            return letters[0];
        }
        for(int i=0; i<letters.length; i++){
            if(target == letters[i]){
                return letters[i+1];
            }
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > letters[mid]){
                start = mid+1;
            }else if(target < letters[mid]){
                end = mid-1;
            }else{
                return letters[mid];
            }
        }
        return letters[start];

    }
}
