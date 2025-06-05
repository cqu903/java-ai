package com.zerofinance.spring_ai_study.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class BubbleSortUtilsTest {

    @Test
    void testSortIntegers() {
        // 准备测试数据
        Integer[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        Integer[] expected = { 11, 12, 22, 25, 34, 64, 90 };

        // 执行排序
        BubbleSortUtils.sort(arr);

        // 验证结果
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortStrings() {
        // 准备测试数据
        String[] arr = { "香蕉", "苹果", "橙子", "葡萄", "西瓜" };
        String[] expected = { "橙子", "苹果", "葡萄", "西瓜", "香蕉" };

        // 执行排序
        BubbleSortUtils.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 验证结果
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortEmptyArray() {
        // 准备测试数据
        Integer[] arr = {};
        Integer[] expected = {};

        // 执行排序
        BubbleSortUtils.sort(arr);

        // 验证结果
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortSingleElementArray() {
        // 准备测试数据
        Integer[] arr = { 1 };
        Integer[] expected = { 1 };

        // 执行排序
        BubbleSortUtils.sort(arr);

        // 验证结果
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortNullArray() {
        // 准备测试数据
        Integer[] arr = null;

        // 执行排序（不应抛出异常）
        BubbleSortUtils.sort(arr);
    }

    @Test
    void testSortAlreadySortedArray() {
        // 准备测试数据
        Integer[] arr = { 1, 2, 3, 4, 5 };
        Integer[] expected = { 1, 2, 3, 4, 5 };

        // 执行排序
        BubbleSortUtils.sort(arr);

        // 验证结果
        assertArrayEquals(expected, arr);
    }
}