package Algorithms.Java.src.PalindromeNumber;
/*
* Source : https://leetcode.com/problems/palindrome-number/
* Author : AZ
* Date   : 25.04.2023
* */
public class Solution {
    public boolean isPalindrome(int x) {

        System.out.println(new StringBuilder(Integer.toString(x)).reverse());
        System.out.println(Integer.toString(x));
        if (new StringBuilder(Integer.toString(x)).reverse().toString().equals(Integer.toString(x)))  {
            return true;
        }
        else {
            return false;
        }
    }
}
