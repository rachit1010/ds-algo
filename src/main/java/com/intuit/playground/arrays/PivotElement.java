package com.intuit.playground.arrays;

public class PivotElement {

    static public int getPivot(int[] nums) {
        return getPivot(nums, 0, nums.length - 1);
    }

    static public int getPivot(int[] nums, int lo, int hi) {
        if (lo == hi)
            return -1;
        int mid = (lo + hi) / 2;
        if (nums[mid - 1] > nums[mid])
            return mid - 1;
        if(nums[mid]>nums[mid+1])
            return mid;
        if (nums[mid] > nums[hi])
            return getPivot(nums, mid+1, hi);
        else
            return getPivot(nums, 0, mid - 1);


    }

    public static void main(String[] args) {
//        int[] nums = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        //int[] nums = new int[]{1,2,3,1};
        int[] nums={1,2 };

        //System.out.println("Pivot Element is found at:"+getPivot(nums));
        int k=1/2;
        System.out.println("k:"+k);
    }

}
