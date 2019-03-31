//package com.intuit.playground;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//
//public class SortedIntSet {
//    int[] array;
//
//    SortedIntSet(int[] arr) {
//        this.array = arr;
//    }
//
//    public Iterator<Integer> iterator() throws Exception {
//        counter =0;
//        return new Iterator<Integer>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Integer next() {
//
//                return array[counter++];
//                throw new NoSuchElementException()
//            }
//        }
//
//    }
//
//
//    public static void main(String[] args) throws Exception {
//        //Test Case1
//        SortedIntSet set1 = new SortedIntSet(new int[]{});
//        Iterator<Integer> it=new Iterator<Integer>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Integer next() {
//                return null;
//            }
//        }
//        assert(false,it.hasNext());
//
//        //Test Case2
//        SortedIntSet set2 = new SortedIntSet(new int[]{1,2,3});
//        assert(1, it.next().intValue());
//        assert(true,it.hasNext());
//        assert(2, it.next().intValue());
//        assert(true,it.hasNext());
//        assert(3, it.next().intValue());
//        assert(false,it.hasNext());
//    }
//
//}
