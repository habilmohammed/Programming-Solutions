package com.solutions.habilmohammed.test;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    System.out.println("Enter the size of the sq matrix : ");
    int n = sc.nextInt();
    System.out.println("Enter elements : ");
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
    alterMatrix(matrix);
    System.out.println("Matrix After alter:");
    System.out.println(matrix);
    
  }

  private static void alterMatrix(ArrayList<ArrayList<Integer>> matrix) {
    // TODO Auto-generated method stub
    matrix.get(0).set(0, 9);
    
  }

}
