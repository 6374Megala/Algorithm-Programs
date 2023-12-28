package com.algorithm.programs;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int[] num = new int[scan.nextInt()];
        System.out.println("Enter the integers:");
        for (int i = 0; i <num.length ; i++) {
            num[i] = scan.nextInt();
        }
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
    public static void bubbleSort(int[] arr){
        boolean a;
        for (int i = 0; i < arr.length; i++) {
            a = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    a = true;
                }
            }
            if (!a) {
                break;
            }
        }
    }
}
