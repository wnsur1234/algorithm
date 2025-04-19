package com.inflean.generic.ex2;

import com.inflean.generic.animal.Animal;
import com.inflean.generic.animal.Cat;
import com.inflean.generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물",0);
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이",50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = "+findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = "+findCat);
    }
}
