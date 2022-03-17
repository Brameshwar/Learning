package com.bramesh.twoSum;

import java.util.HashMap;
import java.util.Map;

public class BestSolution {
    public static void main(String[] args) {
        int[] result =  performTwoSum(new int[]{2,7,11,15}, 9);
        System.out.println(result[0]+""+result[1]);
    }

    public static int[] performTwoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }
    }
