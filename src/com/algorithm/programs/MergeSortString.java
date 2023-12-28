package com.algorithm.programs;

import java.util.Arrays;

public class MergeSortString {
    public static void main(String[] args) {
       String[] array = {"sanju","poorvika","vijay","shwetha","rani","vidhya","girish","vinitha"};
        String[] res=mergeSort(array);
        System.out.println(Arrays.toString(res));
    }
    static String[] mergeSort(String[] array){
        if(array.length==1){
            return array;
        }
        int mid=array.length/2;
        String[] left=mergeSort(Arrays.copyOfRange(array,0,mid));
        String[] right=mergeSort(Arrays.copyOfRange(array,mid,array.length));
        return merge(left,right);
    }
    static String[] merge(String[] first,String[] second){
        String[] newarr=new String[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j< second.length){
            if(first[i].compareTo(second[j])<0){//first[i]<second[j]){
                newarr[k]=first[i];
                i++;
            }
            else{
                newarr[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            newarr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            newarr[k]=second[j];
            j++;
            k++;
        }
        return newarr;
    }
}
