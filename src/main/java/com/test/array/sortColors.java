package com.test.array;

import java.util.Arrays;

/**
 * @author guoqinglin
 * @create 2020-05-25-7:47
 */

/*
荷兰三色国旗问题
左指针指向0的下一个位置，右指针指向右边2的前一个位置，然后用一个cur遍历这两个位置之间的值，
如果有0，则和左边进行交换，如果有2，则跟右边的值进行交换
 */
public class sortColors {
    public int[] sortColors(int[] A) {
        int zeroIndex = 0;
        int twoIndex = A.length - 1;
        int i=0;
        while (i < twoIndex + 1) {
            if (A[i] == 0) {
//                A[i] = A[zeroIndex];
//                A[zeroIndex] = 0;
                swap(A,i,zeroIndex);
                zeroIndex++;
                i++;
            }else if (A[i] == 2) {
//                A[i] = A[twoIndex];
//                A[twoIndex] = 2;
                swap(A,i,twoIndex);
                twoIndex--;
            }else  i++;

        }
        return A;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a={0,2,2,1,0};
        sortColors s = new sortColors();
        s.sortColors(a);
        System.out.println(Arrays.toString(a));
    }
}
