package com.test.search;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:42
 */
public class searchRange {

    public int[] searchRange(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int[] ar = new int[]{-1,-1};
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]== target){
                int L=mid;int R=mid;
                // 找到最左边和target相等的元素
                while (R + 1 < nums.length && nums[R+1] == target) R++;
                // 找到最友边和target相等的元素
                while (L - 1 >= 0 && nums[L-1] == target) L--;
                ar[0] = L;
                ar[1] = R;
                return ar;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{right=mid-1;}
        }
        return ar;
    }
}
