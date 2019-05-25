/*
 * 

Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

Example:

Input : [1, 0]
Return : [0, 1]

    Lets say N = size of the array. Then, following holds true :

        All elements in the array are in the range [0, N-1]
        N * N does not overflow for a signed integer

 * */

/*SOLUTION LOGIC
 * 
 * If we could somehow store 2 numbers in every index ( that is, Arr[i] can contain the old value and the new value somehow ), then the problem becomes very easy.
NewValue of Arr[i] = OldValue of Arr[OldValue of Arr[i]]

Now, we will do a slight trick to encode 2 numbers in one index.
This trick assumes that N * N does not overflow.

1) Increase every Array element Arr[i] by (Arr[Arr[i]] % n)*n.
2) Divide every element by N.

Given a number as

   A = B + C * N   if ( B, C < N )
   A % N = B
   A / N = C

We use this fact to encode 2 numbers into each element of Arr.
 * 
 * */

package com.solutions.habilmohammed.math;

import java.util.ArrayList;
import java.util.Scanner;

public class RearrangeArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("Enter the size:");
    int n = sc.nextInt();
    for (int i=0;i<n;i++) {
      int elem = sc.nextInt();
      list.add(elem);
    }
    arrange(list);
    System.out.println("Arranged list" + list);
    
  }

  private static void arrange(ArrayList<Integer> list) {
    // TODO Auto-generated method stub
    int n = list.size();
    for (int i=0;i<list.size();i++) {
      int encodedElement = list.get(i) + ( (list.get(list.get(i))%n) * n );
      list.set(i, encodedElement);
    }
    for (int i=0;i<list.size();i++) {
      list.set(i, list.get(i)/n);
    }
  }

}
