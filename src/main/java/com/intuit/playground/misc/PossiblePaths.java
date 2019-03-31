package com.intuit.playground.misc;

import java.util.ArrayList;

public class PossiblePaths {

    void printPaths(int[][] arr, int numofRows, int numofCols,int r, int c, int[] pathTillNow) {
        if (r == numofRows && c==numofCols){
            printPathTillNow(pathTillNow);
            return;
        }
        if(r> numofRows || c>numofCols)
        {
            return;
        }
//        pathTillNow[]
//        printPaths(arr,numofRows,numofCols,r,c+1,);

    }

    private void printPathTillNow(int[] path){
        for(int i:path){
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5, 6};
        int numOfRows=arr.length;
        int numOfCols=arr[0].length;
        int[] pathTillNow=new int[numOfCols+numOfRows-1];
        PossiblePaths pp = new PossiblePaths();
//        pp.printPaths(arr,arr.length,arr[0].length,0,0,pathTillNow);
        ArrayList<Integer> lst=new ArrayList<Integer>();

    }
}
