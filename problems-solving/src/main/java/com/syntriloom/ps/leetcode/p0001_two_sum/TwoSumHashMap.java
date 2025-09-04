package com.syntriloom.ps.leetcode.p0001_two_sum;

import java.util.Map;
import java.util.HashMap;

public class TwoSumHashMap implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer needIndex = seen.get(need);
            if (needIndex != null)
                return new int[] { needIndex, i };
            seen.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

}
