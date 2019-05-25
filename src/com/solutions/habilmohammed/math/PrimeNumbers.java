/*
 * Given a number N, find all prime numbers upto N ( N included ).

Example:

if N = 7,

all primes till 7 = {2, 3, 5, 7}

Make sure the returned array is sorted.
Use Sieve of Eratosthenes algorithm to decrease complexity.
 * */

package com.solutions.habilmohammed.math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    int n;
    ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    System.out.println("Enter the number : ");
    n= sc.nextInt();
    primeNumbers = sieve(n);
    System.out.println("Prime numbers : ");
    System.out.println(primeNumbers);
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
