package com.inflean.generic.test.ex4;

import com.inflean.generic.animal.Animal;
import com.inflean.generic.animal.Cat;
import com.inflean.generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이 ",100);
        Cat cat  = new Cat("야옹이 ",100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰멍멍이",200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println(bigger);

        
    }
}
