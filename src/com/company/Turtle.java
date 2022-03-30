package com.company;

public class Turtle implements Swimable{


    public Turtle() {
    }

    @Override
    public void swim(String swim) {
        Swimable.super.swim(swim);
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swiming");

    }
}
