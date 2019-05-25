/*
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach�s conjecture

Example:

Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.
 * */

package com.solutions.habilmohammed.math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class PrimeSum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n= sc.nextInt();
    System.out.println("Prime Sum : " + primesum(n));
  }
  
  
  private static ArrayList<Integer> primesum(int n) {
    
    ArrayList<Integer> primes = sieve(n);
    ArrayList<Integer> primeSums = new ArrayList<Integer>();
    for (int i=0;i<primes.size();i++) {
      int n1=primes.get(i);
      int n2=n-n1;
      if (isPrime(n2)) {
        primeSums.add(n1);
        primeSums.add(n2);
        return primeSums;
      } 
        
    }
    return primeSums;
  }

  private static ArrayList<Integer> sieve(int n) {
    // TODO Auto-generated method stub
    ArrayList<Integer> primes = new ArrayList<Integer>();
   
    for (int i=2;i<=n;i++) 
      primes.add(i);
    for (int i=0;i<primes.size();i++) {
      Integer e = primes.get(i);
      if (isPrime(e)) {
        for (Integer j=e*2;j<=n;j=j+e) {
          primes.remove(j);
        }
      } else {
        primes.remove(e);
      }
    }
    return primes;
  }

  private static boolean isPrime(int n) {
    // TODO Auto-generated method stub
    if (n==2)
      return true;
    
    for (int j=2;j<=Math.sqrt(n);j++) {
      if (n%j==0) {
        return false;
      }
    }
    return true;
  }

}
