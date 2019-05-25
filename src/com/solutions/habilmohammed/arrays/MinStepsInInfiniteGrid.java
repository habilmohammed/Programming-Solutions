/*
You are in an infinite 2D grid where you can move in any of the 8 directions :
(x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1).
You are given a sequence of points and the order in which you need to cover the points. 
Give the minimum number of steps in which you can achieve it. 
You start from the first point.
*/
package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MinStepsInInfiniteGrid {

  public static void main(String args[]) {
    
    List<Integer> Xlist = new ArrayList<Integer>();
    List<Integer> Ylist = new ArrayList<Integer>();
    
    Xlist.addAll(Arrays.asList(1,3, 4, 4));
    Ylist.addAll(Arrays.asList(1,3, 4, 6));

    
    int minSteps = coverPoints(Xlist, Ylist);
    System.out.println("Min Steps : " + minSteps);
    
  }

  private static int coverPoints(List<Integer> xlist, List<Integer> ylist) {
    int currentX = 0, currentY = 0, count = 0;
    int nextX, nextY;
    Iterator<Integer> xIterator = xlist.iterator();
    Iterator<Integer> yIterator = ylist.iterator();
    int n = xlist.size();
    int nVerify = ylist.size();
    if (n != nVerify) {
      return -1;
    }
    if (xIterator.hasNext() && yIterator.hasNext()) {
      currentX = xIterator.next();
      currentY = yIterator.next();
    }
    while (xIterator.hasNext() && yIterator.hasNext()) {
      nextX = xIterator.next();
      nextY = yIterator.next();
      int diffX = nextX - currentX;
      int diffY = nextY - currentY;
      while (!(currentX==nextX && currentY==nextY)) {
        if ( diffX > 0 ) {
          currentX++;
          diffX--;
        } else if (diffX < 0) {
          currentX--;
          diffX++;
        }
        if ( diffY > 0 ) {
          currentY++;
          diffY--;
        } else if ( diffY < 0 ) {
          currentY--;
          diffY++;
        }
        count++;
        
      }
      
    }
    
    return count;
  }
  
}
