/*
 * Given a number N, find all factors of N.

Example:

N = 6 
factors = {1, 2, 3, 6}


 * */

package com.solutions.habilmohammed.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllFactors {
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter a number :");
    n = sc.nextInt();
    System.out.println("Factors are : "  + allFactors(n));
  }

  private static ArrayList<Integer> allFactors(int n) {
    
    ArrayList<Integer> factors = new ArrayList<Integer>();
    
      for (int i=1;i<=Math.sqrt(n);i++) {
      if (n%i == 0) {
        factors.add(i);
        if (i!=Math.sqrt(n))
          factors.add(n/i);
      }
    }
    Collections.sort(factors);
    
    return factors;
  }

}
