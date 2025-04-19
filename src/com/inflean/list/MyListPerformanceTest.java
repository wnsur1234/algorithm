package com.inflean.list;

import org.w3c.dom.ls.LSOutput;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("===MyArrayList 앞에 추가===");
        addFirst(new MyArrayList<>(),size);
        System.out.println("===MyArrayList 중간 추가===");
        addMid(new MyArrayList<>(),size);
        MyArrayList<Integer> arrayList = new MyArrayList<>(); // 조회용 데이터로 사용
        System.out.println("===MyArrayList 마지막 추가===");
        addLast(arrayList,size);

        int loop = 100000;
        System.out.println("MyArrayList 조회 ==");


        System.out.println(" ");



        System.out.println("===MyLinkedList 앞에 추가===");
        addFirst(new MyLinkedList<>(),size);
        System.out.println("===MyLinkedList 중간 추가===");
        addMid(new MyLinkedList<>(),size);
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<Integer>();
        System.out.println("===MyLinkedList 마지막 추가===");
        addLast(integerMyLinkedList,size);
    }
    private  static void addFirst(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("크기 : "+size+", 계산시간 : "+(endTime - startTime)+"ms");
    }
    private  static void addMid(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("크기 : "+size+", 계산시간 : "+(endTime - startTime)+"ms");
    }
    private  static void addLast(MyList<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("크기 : "+size+", 계산시간 : "+(endTime - startTime)+"ms");
    }

}
