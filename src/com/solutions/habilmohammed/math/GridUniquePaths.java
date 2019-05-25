package com.solutions.habilmohammed.math;

import java.util.Scanner;

public class GridUniquePaths {

  //Not Completed
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("m x n :");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int res = uniquePaths(m,n);
    System.out.println("Number of routes:" + res);
  
  }

  private static int uniquePaths(final int m,final int n) {
    
    //int res = (int) (permutation(m+n-2, n-1)  / factorial(n-1)) ;
    
    //Factorial operation
    long factResult = 1;
    for (int factor = 2; factor <= n-1; factor++) {
      factResult *= factor;
    }
    
    //Permutation operation
    int N = m+n-2; int R = n-1;
    boolean divided = false;
    long result=1;
    for (int i=N; i>N-R;i--) {
      result *= i;
      if (result%factResult==0 && divided==false ) {
        result = result/factResult;
        divided=true;
      }
    }
    
    return (int) result;
    
  }

  private static long factorial(int number) {
    long result = 1;
    for (int factor = 2; factor <= number; factor++) {
        result *= factor;
    }
    return result;
  }
  
  private static long permutation(int n , int r) {
    long result=1;

    for (int i=n;i>n-r;i--) {
      result *= i;
    }
    
    return result;
  }
  
 
}
