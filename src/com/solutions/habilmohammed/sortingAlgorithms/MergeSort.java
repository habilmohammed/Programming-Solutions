package com.solutions.habilmohammed.sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
  
  public static void main(String args[]) {
  
    List<Integer> list = new ArrayList<Integer>();
    
    Scanner s = new Scanner(System.in);
    final int n;
    
    System.out.println("Enter the number of elements: ");
    n = s.nextInt();
    System.out.println("Enter the elements : ");
    for (int i=0;i<n;i++) {
      list.add(s.nextInt());
    }
    mergeSort(list);
    System.out.println("List after sorting : "+ list);
    
    s.close();
  }

  private static void mergeSort(List<Integer> list) {
    
    int n = list.size();
    if (n<2)                // Base Condition
      return;
    int mid = (n)/2;
    List<Integer> left =  new ArrayList<Integer>(list.subList(0, mid));
    List<Integer> right = new ArrayList<Integer>(list.subList(mid, n));
    mergeSort(left);
    mergeSort(right);
    merge(left, right, list);
    
  }

  private static void merge(List<Integer> left, List<Integer> right,
      List<Integer> list) {
    
    int i=0,j=0,k=0;
    int nL = left.size();
    int nR = right.size();
    
    while ( i<nL && j<nR ) {
      if (left.get(i) <= right.get(j) ) {
        list.set(k, left.get(i));
        i++;
      } else {
        list.set(k, right.get(j));
        j++;
      }
      k++;
    }
    while ( i<nL ) {
      list.set(k, left.get(i));
      i++;
      k++;
    }
    while ( j<nR ) {
      list.set(k, right.get(j));
      j++;
      k++;
    }
 
  }
  
}
