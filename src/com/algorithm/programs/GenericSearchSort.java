package com.algorithm.programs;

import java.util.Arrays;

public class GenericSearchSort {
    public static void main(String[] args) {
        Integer[] intarr={60,10,30,20,70,80};
        insertionSort(intarr);
        System.out.println(Arrays.toString(intarr));
        Integer key=60;
        int index=binarySearch(intarr,key);
        System.out.println(key+" is present in index "+index);

    }
    public static<T extends  Comparable<T>> void insertionSort(T[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                T key=arr[j-1];
                if(arr[j].compareTo(key)<0){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static<T> void swap(T[] arr,int fir,int sec){
        T temp=arr[fir];
        arr[fir] =arr[sec];
        arr[sec]=temp;
    }
    private static<T extends  Comparable<T>> int binarySearch(T[] wordList, T searchWord) {
        int low = 0;
        int high = wordList.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparisonResult = searchWord.compareTo(wordList[mid]);

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
