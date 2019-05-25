/*
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1

On returning, the array A should be :

0 0 0
1 0 1
1 0 1

 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SetMatrixZeroes {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    System.out.println("Enter the size of the matrix (m x n) : ");
    int m = sc.nextInt();
    int n = sc.nextInt();
    System.out.println("Enter elements : ");
    for (int i=0;i<m;i++) {
      ArrayList<Integer> row = new ArrayList<Integer>();
      for (int j=0;j<n;j++) {
        int inp = sc.nextInt();
        row.add(inp);
      }
      matrix.add(row);
    }
    System.out.println("Matrix:");
    System.out.println(matrix);
    setZeroes(matrix);
    System.out.println("Matrix After setting zeroes:");
    System.out.println(matrix);
    

  }

  private static void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
    
    int m = matrix.size();
    int n = matrix.get(0).size();
    boolean isFirstRowZero = false;
    boolean isFirstColumnZero = false;
    
    //Checking 1st row for zeroes.
    for (int j=0;j<n;j++) {
      int e = matrix.get(0).get(j);
      if ( e == 0) {
        isFirstRowZero = true;
        break;
      }
    }
    
    //Checking 1st column for zeroes.
    for (int i=0;i<m;i++) {
      int e = matrix.get(i).get(0);
      if ( e == 0 ) {
        isFirstColumnZero = true;
        break;
      }
    }
    
    // Checking for zeroes and storing in 1st row and column.
    for (int i=1 ; i<m ; i++) {
      for (int j=1 ; j<n ; j++) {
        int e = matrix.get(i).get(j);
        if ( e == 0 ) {
          matrix.get(0).set(j, 0);
          matrix.get(i).set(0, 0);
        }
      }
    }
    
    //Zeroing the rows 
    for (int i=1;i<m;i++) {
      if (matrix.get(i).get(0)==0) {
        for (int j=0;j<n;j++) {
          matrix.get(i).set(j,0);
        }
      }
    }
    
    //Zeroing the columns
    for (int j=1;j<n;j++) {
      if (matrix.get(0).get(j)==0) {
        for (int i=1;i<m;i++) {
          matrix.get(i).set(j, 0);
        }
      }
    }
    
    //Zeroing 1st row
    if (isFirstRowZero) {
      for (int j=0;j<n;j++) {
        matrix.get(0).set(j, 0);
      }
    }
    
    //Zeroing 1st column
    if (isFirstColumnZero) {
      for (int i=0;i<m;i++) {
        matrix.get(i).set(0, 0);
      }
    }
    
  }
}
