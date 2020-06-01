package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author guoqinglin
 * @create 2020-05-25-14:12
 */
/*
输入n个整数，找出其中最小的K个数。
 */
public class getLeastNumbers {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k > input.length) {
            return list;
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {   //排序从小到大
                if (input[j] < input[i]) {
                    int tmp = input[j];
                    input[j] = input[i];
                    input[i] = tmp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a={0,2,2,1,0};
        getLeastNumbers s = new getLeastNumbers();
        System.out.println(s.GetLeastNumbers_Solution(a,3));
    }
}

