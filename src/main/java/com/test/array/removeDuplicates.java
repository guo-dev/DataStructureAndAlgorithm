package com.test.array;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:39
 */
public class removeDuplicates {


    public int removeDuplicates(int[] nums) {
        int i = 0;
        if(nums.length == 0)
            return 0;
        else{

            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i] = nums[j];

                }
            }
        }
        return i+1;
    }
}
