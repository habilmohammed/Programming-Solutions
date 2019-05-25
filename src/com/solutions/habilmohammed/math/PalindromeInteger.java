/*
 * 
Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False

 * */

package com.solutions.habilmohammed.math;

import java.util.Scanner;

public class PalindromeInteger {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    System.out.println("Number is palindrome : " + isPalindrome(num));
    
  }

  private static boolean isPalindrome(int num) {
    // TODO Auto-generated method stub
    String numS =  Integer.toString(num);
    int len = numS.length();
    for (int i=0, j=len-1; i<=(len/2)-1 && j>=(len+1)/2 ; i++,j-- ) {
      if (numS.charAt(i) != numS.charAt(j)) {
        return false;
      }
    }
   
    return true;
  }

}
