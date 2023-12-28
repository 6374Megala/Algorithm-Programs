package com.algorithm.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers in the range of 0 to 1000:");
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }   
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while((c*c)<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
