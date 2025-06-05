package com.zerofinance.spring_ai_study.utils;

/**
 * 冒泡排序工具类
 * 支持对实现了Comparable接口的任意类型进行排序
 */
public class BubbleSortUtils {

    /**
     * 对数组进行冒泡排序（升序）
     * 
     * @param arr 待排序的数组
     * @param <T> 元素类型（必须实现Comparable接口）
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 每次循环将最大的元素冒泡到末尾
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // 交换元素
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 如果没有发生交换，说明数组已经有序，可以提前退出
            // 如果在一轮冒泡中没有发生任何交换操作
            // 说明此时数组已经完全有序
            // 无需继续后续的冒泡操作,可以提前结束排序
            if (!swapped) {
                break;
            }
        }
    }
}