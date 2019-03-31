package com.intuit.playground.misc;

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,zeroesL=0,zeroesR=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0){
                // flip it
                sum=sum+1;

            }

            if(nums[i]==1){

            }
        }
    return sum;
    }

    public static void main(String[] args){
        int[] nums=new int[]{1,0,1,1,0};
        ConsecutiveOnes co=new ConsecutiveOnes();
        co.findMaxConsecutiveOnes(nums);
    }
}
