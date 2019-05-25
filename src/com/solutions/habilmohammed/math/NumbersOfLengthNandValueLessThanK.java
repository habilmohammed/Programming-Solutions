/*
 * 
Given a set of digits (A) in sorted order, find how many numbers of length B are possible whose value is less than number C.

    NOTE: All numbers can only have digits from the given set. 

Examples:

    Input:
      3 0 1 5  
      1  
      2  
    Output:  
      2 (0 and 1 are possible)  

    Input:
      4 0 1 2 5  
      2  
      21  
    Output:
      5 (10, 11, 12, 15, 20 are possible)

Constraints:

    1 <= B <= 9, 0 <= C <= 1e9 & 0 <= A[i] <= 9


 * */

package com.solutions.habilmohammed.math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


//Not Completed
public class NumbersOfLengthNandValueLessThanK {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> digits = new ArrayList<Integer>();
    System.out.println("Enter the input");
    int n = sc.nextInt();
    for (int i=1;i<=n;i++) {
      int digit = sc.nextInt();
      digits.add(digit);
    }
    int b = sc.nextInt();
    int c = sc.nextInt();
    int res = solve(digits, b, c);


  }

  private static int solve(ArrayList<Integer> digits, int b, int c) {
    // TODO Auto-generated method stub
    for (int i=0;i<digits.size();i++) {
      int num = digits.get(i);
      int numDigits=b-1;
      for (int j=0; j<i && numDigits>0  ; j++) {
        num = num*10 + digits.get(j);
      }
      for (int j=i+1;j<digits.size();j++) {
        num = num*10 + digits.get(j);
      }
    }
    
    return 0;
  }

}
