package com.inflean.arrayList;

public class MyArrayListMain {

    public static void main(String[] args) {
        myArrayList list = new myArrayList();
        System.out.println("===데이터추가===");
        System.out.println("list = "+list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println("c");
        System.out.println(list);

        System.out.println("===기능 사용====");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2,\"c\") = " + list.set(2, "c"));
        System.out.println(list);

        System.out.println("=== 범위 초과===");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        //범위 초과,capacity가 늘어나지 않으면 예외발생
        list.add("f");
        System.out.println(list);

    }
}
