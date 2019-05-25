/*
 * 

Given a positive integer N, print all the integers from 1 to N. But for multiples of 3 print �Fizz� instead of the number and for the multiples of 5 print �Buzz�. Also for number which are multiple of 3 and 5, prints �FizzBuzz�.

Example

N = 5
Return: [1 2 Fizz 4 Buzz]

Note: Instead of printing the answer, you have to return it as list of strings.

 * */

package com.solutions.habilmohammed.math;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n= sc.nextInt();
    System.out.println("Prime Sum : " + fizzBuzz(n));
  }

  private static ArrayList<String> fizzBuzz(int n) {
    // TODO Auto-generated method stub
    ArrayList<String> res = new ArrayList<String>();
    for (int i=1;i<=n;i++) {
      if (i%3==0 && i%5==0) {
        res.add("FizzBuzz");
      } else if (i%3==0) {
        res.add("Fizz");
      } else if (i%5==0) {
        res.add("Buzz");
      } else {
        res.add(Integer.toString(i));
      }
    }    
    return res;
  }

}
