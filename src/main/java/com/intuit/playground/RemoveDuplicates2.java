package com.intuit.playground;

public class RemoveDuplicates2 {
     public int removeDuplicates(int[] nums) {
        int i=0, j=0;
        while((i+1)<=nums.length-1){
            if(nums[i+1]!=nums[j]){
            swap(nums,i+1,j+1);
            j++;
            }
            i++;
        }
        return j+1;
    }

    void swap(int[] nums,int i, int j){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
    }

    public static void main(String[] args) {
//        int[] input=new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] input=new int[]{1,1};
        RemoveDuplicates2 rd=new RemoveDuplicates2();
        int p=rd.removeDuplicates(input);
        System.out.println("Output is:"+p);
    }
}
