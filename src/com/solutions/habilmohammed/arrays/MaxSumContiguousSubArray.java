/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSumContiguousSubArray {

  public static void main(String[] args) {
    
    List<Integer> list = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);
    final int n;
    final int sum;
    System.out.println("Enter the number of elements: ");
    n = s.nextInt();
    System.out.println("Enter the elements : ");
    for (int i=0;i<n;i++) {
      list.add(s.nextInt());
    }
    
    sum = maxSubArray(list);
    
    
    System.out.println("Maximum sum : "+ sum);
    s.close();

  }

  private static int maxSubArray(List<Integer> list) {
    
    int size = list.size();
    int extSum=0;
    int intSum=0;
    if ( size==0 ) {
      return 0;
    }
    for (int i=0;i<size;i++) {
      
      intSum=0;
      for (int j=i;j<size;j++) {
        
        int tempSum=0;
        if (j==i) {
          intSum=list.get(j);
        } else {
          if ( j == i+1 ) {
            tempSum = intSum + list.get(j);
          } else {
              for (int k=i ; k <= j ; k++) {
                tempSum += list.get(k);
              }
          }
          if (tempSum>intSum) {
           intSum = tempSum; 
          } 
        }
      }
      
      if (i==0) {
        extSum = intSum;
      } else {
        if (intSum > extSum) {
          extSum = intSum;
        }
      }
    
    }
      
    return extSum;
  }

}
