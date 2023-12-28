package com.algorithm.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BinarySearchWord {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Documents\\wordlist.txt";
            String[] wordList = readWordListFromFile(filePath);
            Arrays.sort(wordList);
            String searchWord = getUserInput("Enter a word to search: ");
            boolean isWordFound = binarySearch(wordList, searchWord);
            if (isWordFound) {
                System.out.println("The word \"" + searchWord + "\" is found in the list.");
            } else {
                System.out.println("The word \"" + searchWord + "\" is not found in the list.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private static String[] readWordListFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            return line != null ? line.split(",") : new String[0];
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + e.getMessage());
        }
    }

    private static String getUserInput(String prompt) throws IOException {
        System.out.print(prompt);
        try (BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in))) {
            return reader.readLine();
        } catch (IOException e) {
            throw new IOException("Error reading user input: " + e.getMessage());
        }
    }

    private static boolean binarySearch(String[] wordList, String searchWord) {
        int low = 0;
        int high = wordList.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparisonResult = searchWord.compareTo(wordList[mid]);

            if (comparisonResult == 0) {
                return true;
            } else if (comparisonResult < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
