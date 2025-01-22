/*
You've been using your computer for a long time, so now it's time to check whether this is the correct time to reboot. Given an integer number n that represents the number of minutes by which the computer is powered on. If the computer is on for 67000 - 829000 seconds (inclusive), then return 1 which indicates that computer requires a reboot. and if computer is on for 1000 - 45000 seconds (inclusive), then return 0 which indicates that reboot is not required. and for other conditions, return -1.
*/

package HackerRank;

public class Reboot {
    public static void main(String[] args){
        int n = 68000;
        if(n>=67000 && n<=829000){
            System.out.println(1);
        }else if(n>=1000 && n<=45000){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
