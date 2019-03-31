package com.intuit.playground.graphs;


public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] < 9)
                digits[0] = digits[0] + 1;
            else
                digits = new int[]{1, 0};
        } else if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;

        } else {
            digits[digits.length - 1] = 0;
            int carried_forward = 1;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9 && carried_forward == 1) {
                    if (i == 0) {
                        int[] new_digits = new int[digits.length + 1];
                        new_digits[0] = 1;
                        return new_digits;
                        //create new array and return
                    } else {
                        digits[i] = 0;
                    }
                } else {
                    digits[i] = digits[i] + carried_forward;
                    carried_forward = 0;
                }
            }

        }
        return digits;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{9};
        PlusOne o1 = new PlusOne();
        int[] op=o1.plusOne(arr);
        for (int i : op)
            System.out.print(i + ",");
    }
}
