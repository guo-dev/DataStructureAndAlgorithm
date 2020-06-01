package test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author guoqinglin
 * @create 2020-05-24-16:09
 */
    class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
       if (k == 0 || arr.length == 0) {
        return new int[0];
    }


    TreeMap<Integer, Integer> map = new TreeMap<>();
    int cnt = 0;
        for (int num: arr) {
        if (cnt < k) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            cnt++;
            continue;
        }
        Map.Entry<Integer, Integer> entry = map.lastEntry();
        if (entry.getKey() > num) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (entry.getValue() == 1) {
                map.pollLastEntry();
            } else {
                map.put(entry.getKey(), entry.getValue() - 1);
            }
        }

    }

    int[] res = new int[k];
    int idx = 0;
        for (
    Map.Entry<Integer, Integer> entry: map.entrySet()) {
        int freq = entry.getValue();
        while (freq-- > 0) {
            res[idx++] = entry.getKey();
        }
    }
        return res;
}

    public static void main(String[] args) {
        Solution n = new Solution();
        int a[]= {1,4,6,9,10};
        System.out.println(n.getLeastNumbers(a,2));
    }
    }


