package com.algorithm.programs;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n = scanner.nextInt();
        System.out.println("Enter the words:");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        insertionSort(words);
        System.out.println(Arrays.toString(words));
    }
    private static void insertionSort(String[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(String[] arr,int fir,int sec){
        String temp=arr[fir];
        arr[fir] =arr[sec];
        arr[sec]=temp;
    }
}
