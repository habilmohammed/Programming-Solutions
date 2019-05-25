package com.solutions.habilmohammed.arrays.model;

public class Interval {
  public int start;
  public int end;
  
  public int getStart() {
    return start;
  }
  public void setStart(int start) {
    this.start = start;
  }
  public int getEnd() {
    return end;
  }
  public void setEnd(int end) {
    this.end = end;
  }
  
  public Interval() {
   start = 0;
   end = 0;
  }
  public Interval (int start , int end ) {
    this.start = start;
    this.end = end;
  }
  
  @Override
  public String toString() {
    return "Interval [start=" + start + ", end=" + end + "]";
  }
}
