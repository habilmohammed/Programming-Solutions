/*
 * Given a number N >= 0, find its representation in binary.

Example:

if N = 6,

binary form = 110
 * */

package com.solutions.habilmohammed.math;

import java.util.Scanner;

public class BinaryRepresentation {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n;
    String bin;
    System.out.println("Enter the number : ");
    n= sc.nextInt();
    bin = findDigitsInBinary(n);
    System.out.println("Binary Representation : ");
    System.out.println(bin);
    
  }

  private static String findDigitsInBinary(int n) {
    // TODO Auto-generated method stub
    if (n==0) 
      return "0";
    
    String bin = "";
    while (n>=1) {
      int rem = n%2;
      n = n/2;
      bin = rem + bin;
    }
    //bin = 1 + bin;
    
    return bin;
  }

}
