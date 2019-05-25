/*
 * 
 * You are given an n x n 2D matrix representing an image.Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note that if you end up using an additional array, you will only receive partial score.

Example:
If the array is
[
    [1, 2],
    [3, 4]
]
Then the rotated array becomes:
[
    [3, 1],
    [4, 2]
]

 * 
 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateMatrix {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    System.out.println("Enter the size of the matrix : ");
    int n = sc.nextInt();
    System.out.println("Enter the elements : ");
    for (int i=0;i<n;i++) {
      ArrayList<Integer> row = new ArrayList<Integer>();
      for (int j=0;j<n;j++) {
        int inp = sc.nextInt();
        row.add(inp);
      }
      matrix.add(row);
    }
    System.out.println("Matrix:");
    System.out.println(matrix);
    rotate(matrix);
    System.out.println("Matrix After rotation:");
    System.out.println(matrix);
        
  }

  private static void rotate(ArrayList<ArrayList<Integer>> matrix) {
    
    int size = matrix.size();
    for (int i=0 ; i<size/2 ; i++ ) {
      for (int j=i; j<size-1-i ; j++ ) {        
        swap(matrix, i, j, j, size-1-i);
        swap(matrix, i, j, size-1-i, size-1-j);
        swap(matrix, i, j, size-1-j, i);
      } 
    }
    
  }

  private static void swap(ArrayList<ArrayList<Integer>> matrix, int i1, int j1, int i2, int j2) {
    // TODO Auto-generated method stub
    int temp = matrix.get(i1).get(j1);
    matrix.get(i1).set(j1,  matrix.get(i2).get(j2) );
    matrix.get(i2).set(j2, temp);
  }

  

}
