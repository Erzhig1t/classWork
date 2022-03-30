package com.company;

public interface Swimable {


    default void swim(String swim){
        System.out.println("It is swiming");
    }

    void swim();
}
