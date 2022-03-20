package com.bramesh.linkedLearning;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,6,3,5,8,2,2};
        intArray = sort(intArray,intArray.length-1);
        for(Integer intValue:intArray){
            System.out.println(intValue);
        }
    }

    public static Integer[] sort( Integer[] intArray, int counter){

        int i;

        if(counter==0){
            return intArray;
        }
        else{
        for(i=0; i<counter; i++){
            if(intArray[i]>intArray[i+1]){
                Integer[] intSwapped = swap(intArray[i],intArray[i+1]);
                intArray[i] = intSwapped[0];
                intArray[i+1] = intSwapped[1];
            }
        }

        counter--;

        return sort(intArray, counter);
        }
    }

    public static Integer[] swap(int a, int b){
        return new Integer[]{b,a};
    }

}
