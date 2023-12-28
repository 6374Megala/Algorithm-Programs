package com.algorithm.programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }
    }
    public static boolean areAnagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] a=str1.toLowerCase().toCharArray();
        char[] b=str2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
