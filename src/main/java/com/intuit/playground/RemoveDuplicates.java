package com.intuit.playground;

public class RemoveDuplicates {

//    public int removeDuplicates(int[] nums) {
//        if(nums.length==2){
//            return nums[0]!=nums[1]?2:1;
//        }
//        int i = 0, k = 0;
//        while ((k + 1) < (nums.length - 1)) {
//            k = searchLastOccurence(nums, k + 1, nums.length - 1, nums[i]);
//            swap(nums, i + 1, k + 1);
//            i++;
//        }
//        return i + 1;
//    }
//
//    void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }

//    int searchLastOccurence(int[] arr, int lo, int hi, int k) {
//        if (lo > hi)
//            return -1;
//        int mid = lo + (hi - lo) / 2;
//        if (arr[mid] == k ) {
//            if (k < arr[mid + 1])
//                return mid;
//            else {
//                return searchLastOccurence(arr, mid + 1, hi, k);
//            }
//        }
//        return k > arr[mid] ? searchLastOccurence(arr, mid + 1, hi, k) : searchLastOccurence(arr, lo, mid - 1, k);
//    }


    public  int last(int arr[], int low, int high, int x, int n)
    {
        if (high >= low)
        {
            int mid = low + (high - low)/2;
            if (( mid == n-1 || x < arr[mid+1]) && arr[mid] == x)
                 return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid -1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
    return -1;
    }

    public static void main(String[] args) {
//        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] input = new int[]{1,1,1};
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println("LAst occurener:"+rd.last(input,0,input.length-1,1,input.length));
//        int p = rd.removeDuplicates(input);
//        System.out.println("Output is:" + p);
    }
}
