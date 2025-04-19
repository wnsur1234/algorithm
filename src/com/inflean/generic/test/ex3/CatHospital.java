package com.inflean.generic.test.ex3;

import com.inflean.generic.animal.Cat;

public class CatHospital {

    private Cat animal;
    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("이름 : "+animal.getName());
        System.out.println("크기 : "+animal.getSize());
        animal.sound();
    }
    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
