package com.zb.algorithm.bubble;

import com.zb.algorithm.SortUtil;

/**
 * 冒泡排序：
 * 交换相邻的两个元素，把大的放后面。第一次遍历确定一个最大值，第二次确定次大的......
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        SortUtil.printdata(data);

        int size = data.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if(data[j] > data[j+1]){
                    SortUtil.swap(data, j, j+1);
                }
            }
        }
        SortUtil.printdata(data);
    }
}
