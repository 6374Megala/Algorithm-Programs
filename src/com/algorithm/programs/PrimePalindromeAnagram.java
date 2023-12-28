package com.algorithm.programs;

public class PrimePalindromeAnagram {
    public static void main(String[] args) {    
     for (int i = 0; i <= 1000; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                List<Integer> anagrams = findAnagrams(i);
                if (!anagrams.isEmpty()) {
                    System.out.println(i + " is a Prime, Anagram, and Palindrome.");
                    System.out.println("Anagrams: " + anagrams);
                    System.out.println();
                }
            }
        }
    }
    public static boolean isPalindrome(int i){
        int originalno=i;
        int rev=0;
        while(i>0){
            int digit=i%10;
            rev=rev*10+digit;
            i/=10;
        }
        return rev==originalno;
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
    private static List<Integer> findAnagrams(int number) {
        List<Integer> anagrams = new ArrayList<>();

        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i) && areAnagrams(number, i)) {
                anagrams.add(i);
            }
        }
        return anagrams;
    }

    private static boolean areAnagrams(int num1, int num2) {
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        return sortString(str1).equals(sortString(str2));
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
