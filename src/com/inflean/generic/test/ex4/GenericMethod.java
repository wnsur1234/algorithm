package com.inflean.generic.test.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("Object print : "+obj);
        return  obj;
    }
    // <>로 제네릭 메서드야를 알려주고 반환 타입 T를 쓴다
    public static <T> T genricMethod(T t){
        System.out.println("Object print : "+t);
        return  t;
    }
    public static <T extends Number> T numberMethod(T t){
        System.out.println("Object print : "+t);
        return  t;
    }
}
