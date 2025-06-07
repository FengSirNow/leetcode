package com.leetcode.hot100;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName Test_238
 * @description: TODO
 * @datetime 2025年 06月 06日 10:52
 * @version: 1.0
 */
public class Test_238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,2};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        left[0] = 1;
        int[] right = new int[length];
        right[length - 1] = 1;
        int[] res = new int[length];
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
