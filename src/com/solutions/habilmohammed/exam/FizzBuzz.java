package com.solutions.habilmohammed.exam;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int noOfOnes = 0;
        int noOfZeroes = 0;
        boolean flag = true;
        int size = number.length();
        for (int i = 0;i<size;i++) {
            int num =   Character.getNumericValue(number.charAt(i));
            if (num==1) {
                noOfOnes++;
            } else {
                noOfZeroes++;
            }
            if (noOfOnes<noOfZeroes && i!=size-1) {
                flag = false;
                break;
            }
            
        }        
        if (noOfOnes==noOfZeroes && flag == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
           
    }
    
}
