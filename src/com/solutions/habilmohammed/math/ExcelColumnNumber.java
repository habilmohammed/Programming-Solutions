/*
 * 

Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 

 * */

package com.solutions.habilmohammed.math;

import java.util.Scanner;

public class ExcelColumnNumber {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the title : ");
    String title = sc.nextLine();
    int number = titleToNumber(title);
    System.out.println("The corresponding number is : " + number);
    
  }

  private static int titleToNumber(String title) {
    // TODO Auto-generated method stub
   int totalVal=0;
   char[] chars =  title.toCharArray();
   for (int i=chars.length-1,k=0 ; i>=0; i--,k++ ) {
     int charVal = (int) chars[i] - 64 ;
     totalVal += Math.pow(26, k) * charVal;
   }
    
    return totalVal;
  }

}
