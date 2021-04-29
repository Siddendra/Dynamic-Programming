package com.sidd.dynamicprogram;

import static java.lang.Math.max;

/**
 * Maximum Sum Subarray Problem - Kadane's Algorithm - Brute Force to Optimised - Dynamic Programming
 */
public class MaximumSumSubarrayProblem {

    public static void main(String args[]) {

        int[] arr = {10, -20, 35, 40, 10, -10, -100, 50};

        int max = arr[0];
        int maxsofar = arr[0];
        for(int i= 1; i< arr.length; i++)  {
            maxsofar = max(arr[i], maxsofar+arr[i]);
            if(maxsofar > max) {
                max = maxsofar;
            }
        }

        System.out.println("Maximum Sum Subarray is::"+ max);

    }
}
