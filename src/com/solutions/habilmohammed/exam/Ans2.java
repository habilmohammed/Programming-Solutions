package com.solutions.habilmohammed.exam;

import java.util.Scanner;

public class Ans2 {
 
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        String[] numbers = array.split(",");
        int largest;
        boolean flag = true;
        Integer[] arr = new Integer[numbers.length];
        int i = 0;
        for (String str : numbers) {
          arr[i] = Integer.parseInt(str);// Exception in this line
          i++;
        }
        bubbleSort(arr);
        largest = arr[arr.length-1];
        for (int j = arr.length-2; j >= 0; j--) {
            if (arr[j]<largest) {
                System.out.println(arr[j]);
                flag = false;
                break;
            }
        }
        
        if (flag == true) {
            System.out.println("NA");
        }
    }
    
    static void bubbleSort(Integer[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
