package com.inflean.generic.test.ex3;

import com.inflean.generic.animal.Animal;
import com.inflean.generic.animal.Cat;
import com.inflean.generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        {

            AnimalHostipalV1 dogHospital = new AnimalHostipalV1();
            AnimalHostipalV1 catHospital = new AnimalHostipalV1();

            Dog dog = new Dog("멍멍이", 100);
            Cat cat = new Cat("멍멍이", 100);

            // 개병원
            dogHospital.set(dog);
            dogHospital.checkup();

            // 고양이 병원
            catHospital.set(cat);
            catHospital.checkup();

            // 문제 1 : 개병원에 고양이 전달
            dogHospital.set(cat); // 매게변수 체크 실패 : 컴파일오류 발생 x

            // 문제 ㅓ2 : 개 타입 반환
            dogHospital.set(dog);
            Animal biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
            System.out.println("biggerDog = "+biggerDog);

        }
    }
}
