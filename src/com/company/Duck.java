package com.company;

public class Duck implements Swimable{
    public Duck() {
    }

    @Override
    public void swim(String swim) {
        Swimable.super.swim(swim);
    }

    @Override
    public void swim() {
        System.out.println("Duck also is swiming");

    }
}
