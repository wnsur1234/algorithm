package com.inflean.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<Integer>(); // O(n)
        MyLinkedList<Integer> list = new MyLinkedList<>(); // O(1)
        BatchProcessor processor = new BatchProcessor(list);

        processor.logic(1_000_000);
    }
}
