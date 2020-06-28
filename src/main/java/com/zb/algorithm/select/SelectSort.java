package com.zb.algorithm.select;

import com.zb.algorithm.SortUtil;

/**
 * 选择排序：
 * 第一次遍历选择最小的值，第二次选择第二小的......
 *
 *
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        SortUtil.printdata(data);
        sort1(data);

        SortUtil.printdata(data);
    }

    static int[] sort1(int[] a) {
        if (a == null || a.length < 2) {
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    SortUtil.swap(a, i, j);
                }
            }
        }
        return a;
    }

    static int[] sort2(int[] a) {
        if (a == null || a.length < 2) {
            return a;
        }
        int size = a.length;
        for (int j = 0; j < size - 2; j++) {
            int tmp = a[j];
            int index  = j;
            for (int i = j+1; i < size; i++) {
                if(a[i] < tmp){
                    tmp = a[i];
                    index = i;
                }
            }
            if(index != j){
                SortUtil.swap(a, index, j);
            }
        }
        return a;
    }
}
