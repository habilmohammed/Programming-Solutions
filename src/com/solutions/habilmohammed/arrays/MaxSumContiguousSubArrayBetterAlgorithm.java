/*
 * 
O(n^3) solution is simple.

You look at every pair (i,j) and compute the sum of elements between i and j and then take the maximum of the sums.

Obviously, this is not the best solution.

Next improvement is O(n^2) when you notice that you don�t need to sum up all the elements between i and j. You can just add A[j] to the sum you have already calculated in the previous loop from i to j-1.

However, we are looking for something better than N^2.

For O(n) solution can you look at optimal subarray and deduce some observations from it?
If you start taking every element greedily when should you stop?

 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaxSumContiguousSubArrayBetterAlgorithm {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    final List<Integer> list = new ArrayList<Integer>();
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
    
    int ans=0;
    boolean isAllNegative=true;
    Iterator<Integer> iterator = list.iterator();
    while(iterator.hasNext()) {
      if ( iterator.next() > 0 ) {
        isAllNegative = false;
        break;
      } 
    }
    
    if (!isAllNegative) {
      int sum=0;
      for ( int i=0 ; i<list.size() ; i++ ) {
        
        if ( sum+list.get(i) > 0 ) {
          sum +=list.get(i);
        } else {
          sum = 0;
        }
        ans = max(ans,sum);
      }      
    } else {
      ans = Integer.MIN_VALUE;
      iterator = list.iterator();
      while (iterator.hasNext()) {
        int n = iterator.next();
        if ( n > ans ) {
          ans = n;
        }
      }
    }
    
    return ans;
  }
  
  private static int max(int ans, int sum) {
    if (ans >= sum) {
      return ans;
    } else {
      return sum;
    }
  }

}
