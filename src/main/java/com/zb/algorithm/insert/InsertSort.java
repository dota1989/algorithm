package com.zb.algorithm.insert;

import com.zb.algorithm.SortUtil;

/**
 * 插入排序：
 * 从一个元素开始，保证前面的都是排了序的
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        SortUtil.printdata(data);
        int[] b = sort1(data);


        SortUtil.printdata(b);
    }

    static int[] sort1(int[] a) {
        int size = a.length;
        for (int i = 1; i < size; i++) {
            int tmp = a[i];
            int j ;
            for (j = i; j > 0 && tmp < a[j-1]; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
        return a;
    }
    static int[] sort(int[] a) {
        if (a == null || a.length < 2) {
            return a;
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    for (int k = i; k > j ; k--) {
                        a[k] = a[k-1];
                    }
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
}
