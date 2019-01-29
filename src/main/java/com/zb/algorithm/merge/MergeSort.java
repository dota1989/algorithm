package com.zb.algorithm.merge;

import com.zb.algorithm.SortUtil;

/**
 * 分而治之：一半一半的处理，一直分，分到最后只有一条数据肯定是有序的
 *
 * 在合并。
 *
 *
 * Created by zhangbin on 2019/1/25.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        SortUtil.printdata(data);

        int size = data.length;
        int[] temp = new int[size];
        sort(data, 0, size-1, temp);
        SortUtil.printdata(data);
    }

    private static void sort(int[] a, int left, int right, int[] temp){
        if(left < right){
            int middle = (left + right)/2;
            sort(a, left, middle, temp);
            sort(a, middle+1, right, temp);
            merge(a, left, middle, right, temp);
        }
    }

    private static void merge(int[] a, int left, int middle, int right, int[] temp) {
        int i = left;
        int j = middle + 1;
        int t = 0;
        while (i <= middle && j <= right){
            if(a[i] <= a[j]){
                temp[t++] = a[i++];
            } else {
                temp[t++] = a[j++];
            }
        }
        while (i <= middle){
            temp[t++] = a[i++];
        }
        while (j <= right){
            temp[t++] = a[j++];
        }
        t = 0;
        while (left <= right){
            a[left++] = temp[t++];
        }

    }
}
