// To test whether List.subList returns a reference or a copy of the original list.
// It is found that only a reference is returned by the function.

package com.solutions.habilmohammed.test;

import java.util.ArrayList;
import java.util.List;

public class SubListFunctionTest {
  
  public static void main(String args[]) {
 
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);list.add(2);list.add(3);list.add(4);
    List<Integer> sublist1 = list.subList(0, 2);
    System.out.println("Before change : " + sublist1);
    list.set(0, 55);
    System.out.println("After change : " + sublist1);
  }
  

}
