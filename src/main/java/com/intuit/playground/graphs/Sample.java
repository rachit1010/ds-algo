package com.intuit.playground.graphs;

public class Sample {
    int j;
    boolean k;
    float l;
    long p;
    int[] arr=new int[4];

    public static void main(String[] args) {
        Sample s=new Sample();
        System.out.println(s.j);
        System.out.println(s.k);
        System.out.println(s.l);
        System.out.println(s.p);
        for(int j: s.arr){
            System.out.println(j);
        }

    }
}
