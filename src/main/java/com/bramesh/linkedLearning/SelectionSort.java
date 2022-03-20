package com.bramesh.linkedLearning;

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {1,6,3,5,8,2,2};
        intArray = sortArray(intArray);

        for(Integer intValue:intArray){
            System.out.println(intValue);
        }
    }

    public static int[] sortArray(int[] intArray){

        int startPosition = 0;

        for(int intValue:intArray){
            int smallestPosition = findSmallestPosition(intArray, startPosition);
            if(smallestPosition != startPosition) {
                int temp = intArray[smallestPosition];
                intArray[smallestPosition] = intArray[startPosition];
                intArray[startPosition] = temp;
            }
            startPosition++;
        }

        return intArray;
    }

    public static int findSmallestPosition(int[] intArray, int startPosition){

        int smallestPosition = startPosition;

        for(int i=startPosition; i<intArray.length-1; i++){
            if (intArray[smallestPosition]>intArray[i+1]){
                smallestPosition = i+1;
            }
        }

        return smallestPosition;
    }

}
