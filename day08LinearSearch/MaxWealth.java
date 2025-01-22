/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
Example 1:
Input: accounts = [[1, 2, 3],[3, 2, 1]]
Output: 6

Example 2:
Input: accounts = [[1,5], [7,3], [3,5]]
Output: 10
*/

// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    
}
public int maximumWealth(int[][] accounts){
    // person = rol
    // account = col
    int ans = Integer.MIN_VALUE;
    for(int person = 0; person < accounts.length; person++){
        // when you start a new col, take a new sum for that row
        int sum = 0;
        for(int account = 0; account < accounts[person].length; account++){
            sum += accounts[person][account];
        }
        // now we have sum of accounts of person
        // check with overall ans
        if(sum > ans){
            ans = sum;
        }
    }
    return ans;
}
