package com.inflean.generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i= 10;
        // static 이였기 때문에 바로 쓰임
        Object object  = GenericMethod.objMethod(i); // object 타입으로 반환 한거고
        Integer result  = (Integer) GenericMethod.objMethod(i); // Integer으로 캐스팅해서 Integer으로 반환

        // 타입 인자(Type Argument) 명시적 전달 // 넣은 타입으로 꺼내고 싶음
        System.out.println("명시적 타입 인자 전달");
        // 호출할때 타입을 정해줌
        Integer reuslt = GenericMethod.<Integer>genricMethod(i);
        System.out.println(reuslt);

         GenericMethod.numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.1);
    }
}
