package com.intuit.playground;



public class Pivot {


    public int search(int[] nums, int target) {
        int pivotPos = nums.length == 1 ? -1 : findPivot(nums, 0, nums.length - 1);
        if (pivotPos == -1)
            return search(nums, 0, nums.length - 1, target);
        else {
            int hi = nums[nums.length - 1];
            if (target == hi)
                return nums.length - 1;
            else if (target > hi)
                return search(nums, 0, pivotPos, target);
            else
                return search(nums, pivotPos + 1, nums.length - 1, target);
        }
    }


    int search(int[] a, int lo, int hi, int tgt) {
        if (hi < lo)
            return -1;
        int mid = (lo + hi) / 2;
        if (a[mid] == tgt)
            return mid;
        else if (tgt > a[mid])
            return search(a, mid + 1, hi, tgt);
        else
            return search(a, lo, mid - 1, tgt);
    }

    int findPivot(int[] a, int lo, int hi) {
        if (hi < lo)
            return -1;
        if(hi-lo<2){
            if(a[lo]>a[hi])
                return lo;
            else return -1;
        }
        int mid = (lo + hi) / 2;
        if (a[mid] > a[mid + 1])
            return mid;
        else if(a[mid-1]>a[mid])
            return mid-1;
        else if (a[mid] > a[hi]) //
            return findPivot(a, mid + 1, hi);
        else
            return findPivot(a, lo, mid - 1);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5,1,3};
        Pivot pvt = new Pivot();
        System.out.println("Pivot is at index: " + pvt.findPivot(arr, 0, arr.length - 1));
        System.out.println("Element is at:" + pvt.search(arr, 6));

    }
}
