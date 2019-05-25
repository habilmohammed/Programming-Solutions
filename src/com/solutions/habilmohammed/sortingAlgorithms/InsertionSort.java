package com.solutions.habilmohammed.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
  
  static ArrayList<Integer> list = new ArrayList<Integer>();
  
  public static void main(String args[]) {
    
    Scanner s = new Scanner(System.in);
    final int n;
    
    System.out.println("Enter the number of elements: ");
    n = s.nextInt();
    System.out.println("Enter the elements : ");
    for (int i=0;i<n;i++) {
      list.add(s.nextInt());
    }
    insertionSort(list);
    System.out.println("List after sorting : "+ list);
  }

  private static void insertionSort(ArrayList<Integer> list) {
    
    int n = list.size();
    int hole,value;
    for (int i=1;i<n;i++) {
      value=list.get(i);
      hole=i;
      while ( hole>0 && list.get(hole-1) > value  ) {
        list.set(hole, list.get(hole-1));
        hole--;
      }
      list.set(hole, value);
    }
  }
  
}
