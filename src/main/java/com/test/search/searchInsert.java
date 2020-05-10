package com.test.search;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:41
 */
public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;}
            else if(nums[mid]>target){right=mid-1; }
            else if (nums[mid]<target) {    left= mid+1;     }
        }
        return left;

    }
}
