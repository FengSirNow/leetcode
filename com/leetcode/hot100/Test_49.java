package com.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 冯纪元
 * @ClassName Test_238
 * @description: TODO
 * @datetime 2025年 06月 06日 10:52
 * @version: 1.0
 */
public class Test_49 {
    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>( Arrays.stream(strs).collect(Collectors.groupingBy(str -> {
            byte[] bytes = str.getBytes();
            Arrays.sort(bytes);
            return new String(bytes);
        })).values());

    }
}
