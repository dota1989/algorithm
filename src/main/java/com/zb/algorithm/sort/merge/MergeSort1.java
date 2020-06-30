package com.zb.algorithm.sort.merge;

import com.zb.algorithm.util.AlgorithmUtil;

/**
 * 分而治之：一半一半的处理，一直分，分到最后只有一条数据肯定是有序的
 *
 * 在合并。
 *
 *
 * Created by zb on 2019/1/25.
 */
public class MergeSort1 {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(data);

        int[] result = sort(data);

        AlgorithmUtil.printdata(result);
    }

    static int[] sort(int[] a) {
        if (a.length < 2) {
            return a;
        }
        int mid = a.length/2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
        System.arraycopy(a,0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
        int[] leftResult = sort(left);
        int[] rightResult = sort(right);
        return combine(leftResult, rightResult);
    }

    private static int[] combine(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        if (i < left.length) {
            System.arraycopy(left, i, result, k, left.length - i);
        }
        if (j < right.length) {
            System.arraycopy(right, j, result, k, right.length - j);
        }
        return result;
    }
}
