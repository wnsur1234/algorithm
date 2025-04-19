package com.inflean.generic.test.ex3;

import com.inflean.generic.animal.Cat;
import com.inflean.generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("멍멍이", 100);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1 : 개병원에 고양이 전달
        //    dogHospital.set(cat); // 다른 타입 입력 : 컴파일오류

        // 문제 ㅓ2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = "+biggerDog);

    }
}
