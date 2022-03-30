package com.company;

public class Shark implements Swimable{

    public Shark() {
    }

    @Override
    public void swim() {
        Swimable.super.swim("Shark is swiming");
    }
}
