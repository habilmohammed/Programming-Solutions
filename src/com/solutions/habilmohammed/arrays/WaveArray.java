/*
 * 
 * Given an array of integers, sort the array into a wave like array and return it,
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]

NOTE : If there are multiple answers possible, return the one thats lexicographically smallest.
So, in example case, you will return [2, 1, 4, 3] 
 * 
 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WaveArray {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int n;
    System.out.println("Enter the number of elements:");
    n = sc.nextInt();
    if (n>0)
      System.out.println("Enter the elements :");
    for (int i=0;i<n;i++) {
      int element = sc.nextInt();
      list.add(element);
    }
    System.out.println("Waved Array: " + wave(list) );

  }

  private static ArrayList<Integer> wave(ArrayList<Integer> list) {
    
    ArrayList<Integer> wavedList = new ArrayList<Integer>();
    Collections.sort(list);
    if (list.size()%2==0) {
      for (int i=0;i<list.size();i+=2) {
        wavedList.add(list.get(i+1));
        wavedList.add(list.get(i));
      }
    } else {
      int i;
      for (i=0;i<list.size()-1;i+=2) {
        wavedList.add(list.get(i+1));
        wavedList.add(list.get(i));
      }
      wavedList.add(list.get(i));
    }
    return wavedList;
  } 

}
