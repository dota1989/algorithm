package com.zb.algorithm.sort.count;

import com.zb.algorithm.util.AlgorithmUtil;

/**
 * 计数排序
 *  算法的步骤如下：
 *
 * （1）找出待排序的数组中最大和最小的元素
 * （2）统计数组中每个值为i的元素出现的次数，存入数组C的第i项
 * （3）对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）
 * （4）反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1
 *
 * @author zb
 * @since 2020/6/30
 */
public class CountSort {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11};
        AlgorithmUtil.printdata(a);

        int[] b = sort(a);

        AlgorithmUtil.printdata(b);
    }

    static int[] sort(int[] a) {
        // (1)
        int max = a[0], min = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        // (2)
        int size = max - min + 1;
        int[] target = new int[size];
        for (int i : a) {
            target[i - min]++;
        }

        // (3)
        int[] result = new int[a.length];
        int index = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == 0) {
                continue;
            }
            for (int j = 0; j < target[i]; j++) {
                result[index++] = i + min;
            }
        }
        return result;
    }
}
