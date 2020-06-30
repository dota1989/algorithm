package com.zb.algorithm.sort.bubble;

import com.zb.algorithm.util.AlgorithmUtil;

/**
 * 冒泡排序：
 * 交换相邻的两个元素，把大的放后面。第一次遍历确定一个最大值，第二次确定次大的......
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        int[] a = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(data);
        AlgorithmUtil.printdata(a);
        sort1(data);
        sort2(a);
        AlgorithmUtil.printdata(data);
        AlgorithmUtil.printdata(a);
    }

    static int[] sort1(int[] data) {
        if (data == null || data.length < 2) {
            return data;
        }

        int size = data.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if(data[j] > data[j+1]){
                    AlgorithmUtil.swap(data, j, j+1);
                }
            }
        }
        return data;
    }

    static int[] sort2(int[] a) {

        if (a == null || a.length < 2) {
            return a;
        }
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (a[j] > a[j+1]) {
                    AlgorithmUtil.swap(a, j, j + 1);
                }
            }
        }

        return a;
    }
}
