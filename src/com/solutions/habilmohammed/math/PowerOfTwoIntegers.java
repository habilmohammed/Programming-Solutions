/*
 * 
Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 

 * */

package com.solutions.habilmohammed.math;

import java.util.Scanner;

public class PowerOfTwoIntegers {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println("Expressed as A^B : " + isPower(n) );
    
    
  }

  private static boolean isPower(int n) {
    // a^b
    if (n==1)
      return true;
    for (int a=2 ; a*a <= n ; a++) {
      for (int b=2; Math.pow(a, b) <=n ; b++) {
        if (Math.pow(a, b)==n) {
          System.out.println(a+"^"+b);
          return true;
        }
      }
    } 
    return false;
  }

}
