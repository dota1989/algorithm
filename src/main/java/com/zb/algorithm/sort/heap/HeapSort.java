package com.zb.algorithm.sort.heap;

import com.zb.algorithm.util.AlgorithmUtil;

/**
 *
 * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。
 * 堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 * (1) 生成一个大顶堆
 * （2）把堆顶的最大值和最后一位交换
 * （3）重新生成大顶堆，交换堆顶和倒数第二个
 * （4）.。。。。。
 *
 * @author zb
 * @since 2020/6/28
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(data);
        getHeap(data, data.length);

        for (int i = data.length - 1; i >= 0; i--) {
            AlgorithmUtil.swap(data, 0, i);
            getHeap(data, i);
        }
        AlgorithmUtil.printdata(data);
    }

    private static int[] getHeap(int[] a, int max) {

        int mid = max / 2;

        for (int i = mid - 1; i >= 0 ; i--) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < max && a[left] > a[i]) {
                AlgorithmUtil.swap(a, left, i);
            }
            if (right < max && a[right] > a[i]) {
                AlgorithmUtil.swap(a, right, i);
            }
        }

        return a;
    }
}
