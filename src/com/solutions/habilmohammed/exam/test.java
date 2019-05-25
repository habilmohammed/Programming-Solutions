package com.solutions.habilmohammed.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String input = s.nextLine();

    int sum = s.nextInt();
    String[] values = input.split(",");

    Integer[] intarray = new Integer[values.length];
    int i = 0;

    for (String str : values) {
      intarray[i] = Integer.parseInt(str.trim());
      i++;
    }

    List<Integer> pair = hasPairs(intarray, intarray.length, sum);

/*    if (pair == null) {
      System.out.println(false);
    } else {
      System.out.println(true);
      System.out.println(pair.toString().replace("[", "").replace("]", "").replace(" ", ""));
    }
*/
    
    
  }

    private static List<Integer> hasPairs(Integer[] intarray, int length, int sum) {
        // TODO Auto-generated method stub
        for (int i = 0;i<length;i++) {
            for (int j=i+1;j<length;j++) {
                int p1 = intarray[i];
                int p2 = intarray[j];
                if ((p1 + p2) == sum) {
                    System.out.println("true");
                    System.out.println(p1 + ","+p2);
                    return null;
                }
            }
        }
        System.out.println("false");
        
        return null;
    }
    
}
