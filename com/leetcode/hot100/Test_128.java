package com.leetcode.hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 冯纪元
 * @ClassName Test_128
 * @description: TODO
 * @datetime 2025年 06月 06日 17:17
 * @version: 1.0
 */
public class Test_128 {
    public static void main(String[] args) {
            int[] nums = {100,4,200,1,3,2};
            System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            if(set.contains(num-1))continue;
            int temp = num+1;
            while (set.contains(temp)) {
                temp++;
            }
            max = Math.max(max, temp-num);
        }
        return max;
    }
}
