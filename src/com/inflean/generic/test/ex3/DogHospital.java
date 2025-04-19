package com.inflean.generic.test.ex3;

import com.inflean.generic.animal.Dog;

public class DogHospital {
    private Dog animal;
    public void set(Dog animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("이름 : "+animal.getName());
        System.out.println("크기 : "+animal.getSize());
        animal.sound();
    }
    public Dog bigger(Dog target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
