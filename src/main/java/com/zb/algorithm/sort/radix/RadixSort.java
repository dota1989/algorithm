package com.zb.algorithm.sort.radix;

import com.zb.algorithm.util.AlgorithmUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基数排序
 *
 * 先用计数排序排个位，然后排十位， ......
 *
 * @author zb
 * @since 2020/6/30
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 2, 4, 8, 22, 25, 11,101,2008};
        AlgorithmUtil.printdata(data);
        int[] b = sort(data);
        AlgorithmUtil.printdata(b);
    }

    static int[] sort(int[] a) {

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int maxCopy = max;
        int count = 0;
        while (maxCopy/10 != 0) {
            count++;
            maxCopy = maxCopy/10;
        }

        for (int j = 0; j <= count; j++) {
            Map<Integer, List<Integer>> map = new HashMap<>();

            for (int i: a) {
                int key = ( i / (int)Math.pow(10, j) ) % 10;
                List<Integer> list = map.get(key)==null? new ArrayList<>(): map.get(key);
                list.add(i);
                map.put(key, list);
            }

            int[] a1 = new int[a.length];
            int index = 0;
            for (int i = 0; i < 10; i++) {
                List<Integer> list = map.get(i);
                if (list == null || list.size() == 0) {
                    continue;
                }
                for (int i1 = 0; i1 < list.size(); i1++) {
                    a1[index++] = list.get(i1);
                }
            }
            a = a1;
        }


        return a;
    }
}
