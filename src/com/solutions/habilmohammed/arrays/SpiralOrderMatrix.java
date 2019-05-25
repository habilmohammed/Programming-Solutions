/*
Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

GIVEN
[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]

RESULT
[1, 2, 3, 6, 9, 8, 7, 4, 5]
*/

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {
  
  public static void main(String args[]) {
    
    final List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> r1 = new ArrayList<Integer>();
    ArrayList<Integer> r2 = new ArrayList<Integer>();
    ArrayList<Integer> r3 = new ArrayList<Integer>();
    ArrayList<Integer> r4 = new ArrayList<Integer>();
    r1.add(1);r1.add(2);r1.add(3);
    r2.add(4);r2.add(5);r2.add(6);
    r3.add(7);r3.add(8);r3.add(9);
    r4.add(10);r4.add(11);r4.add(12);
    A.add(r1);A.add(r2);A.add(r3);A.add(r4);
   
    int m=A.size();
    int n=A.get(0).size();
    int left = 0; int right = n-1;
    int top = 0; int bottom = m-1;
    int dir=1;
    ArrayList<Integer> spiral = new ArrayList<Integer>();
    
    while (top <= bottom && left <= right ) {
      
      if ( dir == 1 ) {
        for (int i=left;i<=right;i++) {
          Integer num = A.get(top).get(i);
          spiral.add(num);
        }
        top++;
        for (int i=top;i<=bottom;i++) {
          Integer num = A.get(i).get(right);
          spiral.add(num);
          
        }
        right--;
        dir=dir*-1;
      }
      else if ( dir == -1 ) {
        for (int i=right;i>=left;i--) {
          Integer num = A.get(bottom).get(i);
          spiral.add(num);
        }
        bottom--;
        for (int i=bottom;i>=top;i--) {
          Integer num = A.get(i).get(left);
          spiral.add(num);
        }
        left++;
        dir=dir*-1;
      }   
    }
    System.out.println("Program completed");
  
  }

}
