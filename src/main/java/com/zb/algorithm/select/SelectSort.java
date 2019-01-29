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
        int size = data.length;
        for (int j = 0; j < size - 2; j++) {
            int tmp = data[j];
            int index  = j;
            for (int i = j+1; i < size; i++) {
                if(data[i] < tmp){
                    tmp = data[i];
                    index = i;
                }
            }
            if(index != j){
                SortUtil.swap(data, index, j);
            }
        }
        SortUtil.printdata(data);
    }
}
