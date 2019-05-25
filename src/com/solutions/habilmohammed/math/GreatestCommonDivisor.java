/*
 * Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
Both m and n fit in a 32 bit signed integer.

Example

m : 6
n : 9

GCD(m, n) : 3 


 * */

package com.solutions.habilmohammed.math;

import java.util.Scanner;

public class GreatestCommonDivisor {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers m & n :");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int gcd = gcd(m,n);
    System.out.println("GCD is :" + gcd);
    
  }

  private static int gcd(int m,int n) {
    // TODO Auto-generated method stub
    if (m==0) {
      return n;
    } else if (n==0) {
      return m;
    }
      
   
    
    int num = m;
    int den = n;
    int quot = num/den;
    int rem = num%den;
    
    while (rem!=0) {
      num = den;
      den = rem;
      quot = num/den;
      rem = num%den;
    }
    
    return den;
  }

}
