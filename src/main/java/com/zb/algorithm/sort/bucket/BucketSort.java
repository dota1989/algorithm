package com.zb.algorithm.sort.bucket;

import com.zb.algorithm.util.AlgorithmUtil;

/**
 * 桶排序：
 * 先用映射函数把所有的数据尽量均匀的落在每个桶
 * 在对每个桶内的数据经行排序
 *
 * 一个是要判断分桶算法；一个是桶内排序怎么排
 *
 * @author zb
 * @since 2020/6/30
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(a);

        int[] b = sort(a);

        AlgorithmUtil.printdata(b);
    }


    static int[] sort(int[] a) {
        return a;
    }
}
