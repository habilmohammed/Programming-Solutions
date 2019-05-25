/*
 * 
 * Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:

A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]

NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index
 * 
 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MaxNonNegativeSubArray {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    final ArrayList<Integer> list = new ArrayList<Integer>();
    final int n;
    final int sum;
    
    System.out.println("Enter the number of elements: ");
    n = s.nextInt();
    System.out.println("Enter the elements : ");
    for (int i=0;i<n;i++) {
      list.add(s.nextInt());
    }
    System.out.println("Maximum subArray : "+ maxset(list));
    s.close();

  }

  private static ArrayList<Integer> maxset(final ArrayList<Integer> list) {
    
    Iterator<Integer> iterator = list.iterator();
    ArrayList<Integer> ans = new ArrayList<Integer>();
    ArrayList<Integer> tempAns = new ArrayList<Integer>();
    
    while (iterator.hasNext()) {
      int n = iterator.next();
      if (n>=0) {
        tempAns.add(n);
      } else {
        ans=max(ans, tempAns);
        tempAns.clear();
      }
      if (n>=0 && !iterator.hasNext()) {
        ans=max(ans, tempAns);
      } 
      
    }
    return ans;
  }

  private static ArrayList<Integer> max(ArrayList<Integer> ans, ArrayList<Integer> tempAns) {
    
    //long ansSum = ans.stream().mapToInt(Integer::intValue).sum();
    //long tempSum = tempAns.stream().mapToInt(Integer::intValue).sum();
    long ansSum=0,tempSum=0;
    Iterator<Integer> iterator = ans.iterator();
    while (iterator.hasNext()) {
      ansSum +=(long) iterator.next();
    }
    iterator = tempAns.iterator();
    while (iterator.hasNext()) {
      tempSum +=(long) iterator.next();
    }
    ArrayList<Integer> ansReturn;
    if (ansSum > tempSum) {
      ansReturn = new ArrayList<Integer>(ans);
    } else if (tempSum > ansSum) {
      ansReturn = new ArrayList<Integer>(tempAns);
    } else if ( (tempSum==ansSum) && (tempAns.size() > ans.size()) ) {
      ansReturn = new ArrayList<Integer>(tempAns);
    } else {
      ansReturn = new ArrayList<Integer>(ans);
    }
    return ansReturn;
  }
  
}
