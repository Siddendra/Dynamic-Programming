package com.sidd.dynamicprogram;

/**
 * Majority Element in an Array - Moore's Voting Algorithm
 */
public class MajorityElementInArray {

    public static void main(String args[]) {
        int arr[] = {7, 2, 7, 3, 7, 2, 7, 7};
        int major =0, count =1;
        for (int i=1; i<arr.length; i++) {
            if(arr[major] == arr[i]) {
                count++;
            } else  {
                count--;
                if(count == 0) {
                    major = i;
                    count = 1;
                }
            }

        }
        count = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == arr[major]) {
                count++;
            }
        }
        if(count > arr.length /2) {
            System.out.println("The Majority element is :"+arr[major]);
        } else {
            System.out.println("There is no Majority Element");
        }
    }
}
