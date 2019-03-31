package com.intuit.playground;

public class BinarySearch {
    public int searchAnyOccurence(int[] arr, int lo, int hi, int k) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == k) return mid;
        return k > arr[mid] ? searchAnyOccurence(arr, mid + 1, hi, k) : searchAnyOccurence(arr, 0, mid - 1, k);
    }

    public int searchLastOccurence(int[] arr, int lo, int hi, int k) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == k) {
            if (k < arr[mid + 1])
                return mid;

            searchLastOccurence(arr, mid + 1, hi, k);
        }
        return k > arr[mid] ? searchLastOccurence(arr, mid + 1, hi, k) : searchLastOccurence(arr, lo, mid - 1, k);
    }



    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        BinarySearch bs=new BinarySearch();
        System.out.println(bs.searchLastOccurence(nums,1,nums.length-1,0));

    }

}
