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
public class QuickSort {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(data);

        quickSort(data, 0, data.length - 1);

        AlgorithmUtil.printdata(data);
    }

    public static void quickSort(int[] a, int left, int right){
        if(left > right){
            return;
        }
        int tmp = a[left];
        int i = left, j = right;
        while (i != j){
            while (a[j] >= tmp && i < j){
                j--;
            }
            while (a[i] <= tmp && i < j){
                i++;
            }
            if(i<j){
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        a[left] = a[i];
        a[i] = tmp;

        quickSort(a, left, i-1);
        quickSort(a, i+1, right);
    }
}
