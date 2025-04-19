package com.inflean.generic.test.ex3;

import com.inflean.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {

        // 컴파일 오류 안생김
        System.out.println("이름 : " + animal.getName());
        System.out.println("크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        // 컴파일 오류
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
