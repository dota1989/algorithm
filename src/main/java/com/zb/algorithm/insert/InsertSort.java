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

        int size = data.length;

        for (int i = 1; i < size; i++) {
            int tmp = data[i];
            int j ;
            for (j = i; j > 0 && tmp < data[j-1]; j--){
                data[j] = data[j-1];
            }
            data[j] = tmp;
        }
        SortUtil.printdata(data);
    }
}
