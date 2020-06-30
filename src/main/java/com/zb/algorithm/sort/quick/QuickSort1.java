package com.zb.algorithm.sort.quick;

import com.zb.algorithm.util.AlgorithmUtil;

/**
 * 快速排序：
 * 取第一位为标识位，设置2个哨兵，
 * 右哨兵如果比标识位大就左移，如果小就停；
 * 左哨兵移动，如果比标识位小就右移，如果大就停止
 * 交换左右哨兵，继续移动重复上面的过程，直到找到中间点，交换标志位和中间点。
 *
 * 对中间点左边的部分和右边的分别执行上面的过程，递归结束。
 */
public class QuickSort1 {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(data);
        sort(data, 0, data.length - 1);
        AlgorithmUtil.printdata(data);
    }

    static void sort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int sentinel = a[start];
        int m = start;
        int n = end;
        while (m < n) {
            while (a[n] > sentinel && n > m) {
                n--;
            }
            while (a[m] <= sentinel && m < n) {
                m++;
            }
            if (m < n) {
                AlgorithmUtil.swap(a, m, n);
            }
        }
        if (m > start) {
            AlgorithmUtil.swap(a, start, m);
        }
        sort(a, start, m - 1);
        sort(a, m + 1, end);
    }
}
