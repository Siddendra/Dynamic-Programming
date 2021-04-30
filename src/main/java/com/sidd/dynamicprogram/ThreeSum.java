package com.sidd.dynamicprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 */
public class ThreeSum {
    public static void main(String args[]) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        if(nums != null && nums.length > 0 ) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            //Set<Pair<Integer, Integer>> set = new HashSet<>();
            for(int i=0; i< nums.length -2; i++) {
                int j= i+1, k= nums.length-1;
                while (j< k) {
                    if(nums[i] + nums[j]+ nums[k] > 0) k--;
                    else if(nums[i] + nums[j] + nums[k] < 0) j++;
                    else{
                       // if(!set.contains(new Pair(nums[i], nums[j]))){
                            res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                         //   set.add(new Pair(nums[i], nums[j]));
                       // }
                        j++;
                        k--;
                    }
                }
            }
            System.out.println("Triplet are :"+ res);
        }
    }
}
