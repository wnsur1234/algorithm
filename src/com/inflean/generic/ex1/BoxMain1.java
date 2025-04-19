package com.inflean.generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        //생성 할 때 <>안에 원하는 타입을 넣어줌
        GenericBox<Integer> integerbox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
        integerbox.set(10);
        Integer integer = integerbox.get();
        System.out.println(integer);

        GenericBox<String> stringbox = new GenericBox<>();
        stringbox.set("Hello");
        String st = stringbox.get();
        System.out.println(st);
    }
}
