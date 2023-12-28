package com.algorithm.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutations {
    public static List<String> generatePermutationsIterative(String str) {
        List<String> result = new ArrayList<>();
        result.add("");

        for (char c : str.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for (String permutation : result) {
                for (int i = 0; i <= permutation.length(); i++) {
                    newPermutations.add(permutation.substring(0, i) + c + permutation.substring(i));
                }
            }
            result = newPermutations;
        }

        return result;
    }
    public static List<String> generatePermutationsRecursive(String str) {
        List<String> result = new ArrayList<>();
        generatePermutationsRecursiveHelper(str.toCharArray(), 0, result);
        return result;
    }

    private static void generatePermutationsRecursiveHelper(char[] chars, int index, List<String> result) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutationsRecursiveHelper(chars, index + 1, result);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }


    public static void main(String[] args) {
        String input = "abc";


        List<String> permutationsIterative = generatePermutationsIterative(input);
        System.out.println("Iterative Permutations: " + permutationsIterative);


        List<String> permutationsRecursive = generatePermutationsRecursive(input);
        System.out.println("Recursive Permutations: " + permutationsRecursive);

        boolean areEqual = areStringArraysEqual(
                permutationsIterative.toArray(new String[0]),
                permutationsRecursive.toArray(new String[0])
        );

        System.out.println("Are the arrays equal? " + areEqual);
    }
    public static boolean areStringArraysEqual(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}
