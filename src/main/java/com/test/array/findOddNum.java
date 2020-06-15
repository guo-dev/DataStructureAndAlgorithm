package com.test.array;

/**
 * @author guoqinglin
 * @create 2020-06-11-15:41
 * 找出数组中唯一出现奇数次的数
 */
public class findOddNum {
    public int findOddNum (int[] nums) {
        int res = 0;

        for (int value: nums)
        {
            res ^= value;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a= {1,1,1,2,2,3,4,3,4};
        findOddNum odd = new findOddNum();
        System.out.println(odd.findOddNum(a));
    }
}


