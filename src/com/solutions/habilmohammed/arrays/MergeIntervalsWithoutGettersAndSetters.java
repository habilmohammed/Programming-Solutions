/*
 * 
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
 * 
 * 
 * */

package com.solutions.habilmohammed.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.solutions.habilmohammed.arrays.model.Interval;

public class MergeIntervalsWithoutGettersAndSetters {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n;
    ArrayList<Interval> intervals = new ArrayList<Interval>();
    
    System.out.println("Enter the number of intervals");
    n = sc.nextInt();
    System.out.println("Enter the intervals : ");
    for (int i=0;i<n;i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();
      intervals.add(new Interval(start, end));
    }
    System.out.println("Enter the interval to insert :");
    int start = sc.nextInt();
    int end = sc.nextInt();
    Interval newInterval = new Interval(start, end);
    
    System.out.println("New Intervals" + insert(intervals,newInterval) );
    
    
  }

  private static ArrayList<Interval> insert(final ArrayList<Interval> intervals, Interval newInterval) {

    if (intervals.isEmpty())
      return new ArrayList<Interval>(Arrays.asList(newInterval));
    
    ArrayList<Interval> newIntervals = new ArrayList<Interval>();
    Interval mergedInterval = new Interval();
    List<Integer> overlappingIntervals = new ArrayList<Integer>();    // Index of overlapping intervals.
    ListIterator<Interval> iterator = intervals.listIterator();
        
    while (iterator.hasNext()) {
      int index = iterator.nextIndex();
      Interval interval = iterator.next();
      if ( Math.max(interval.start, newInterval.start) <= Math.min(interval.end, newInterval.end)  ) {
        overlappingIntervals.add(index);
      }
    }
    
    if (!overlappingIntervals.isEmpty()) {

      for ( int i=0 ; i<overlappingIntervals.get(0) ; i++) {    // Intervals before the new interval.
        newIntervals.add(intervals.get(i));
      }
      
      int startOfOverlapping = intervals.get(overlappingIntervals.get(0)).start;
      int endOfOverlapping = intervals.get( overlappingIntervals.get(overlappingIntervals.size()-1) ).end;
      
      if ( newInterval.start < startOfOverlapping) {
        mergedInterval.start =  newInterval.start;
      } else {
        mergedInterval.start = startOfOverlapping;
      }
   
      if ( newInterval.end > endOfOverlapping) {
        mergedInterval.end = newInterval.end;
      } else {
        mergedInterval.end = endOfOverlapping;
      }
      newIntervals.add(mergedInterval);
      
      
      for (int i=overlappingIntervals.get(overlappingIntervals.size()-1)+1 ; i<intervals.size() ; i++ ) {
        newIntervals.add(intervals.get(i));
      }
      
    } else {
      
      iterator = intervals.listIterator();
      Interval interval = null;
      while (iterator.hasNext()) {
        interval = iterator.next();
        if (newInterval.start < interval.start) {
          newIntervals.add(newInterval);
          iterator.previous();
          break;
        } else {
          newIntervals.add(interval);
          if (!iterator.hasNext()) {
            newIntervals.add(newInterval);
          }
        }
      }
      while (iterator.hasNext()) {
        interval = iterator.next();
        newIntervals.add(interval);
      }
  
    }
    
    return newIntervals;
  }

}
