package com.ilham.pbo.modul6.percobaan;

public class Cat extends Animal{
    public String color = "";

    //constructor dari class Animal
    public Cat() {
    }

    //constructor dari class Animal
    public Cat(String name) {
        super(name);
    }

    //constructor dari class Animal
    public Cat(String name, int age) {
        super(name, age);
    }

    //constructor dari class Cat
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    //Method
    public void walk() {
        System.out.println(this.color +" "+this.name + " walks!");
        System.out.println();
    }
}
