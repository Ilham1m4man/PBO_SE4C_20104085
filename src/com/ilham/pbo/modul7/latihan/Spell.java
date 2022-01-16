package com.ilham.pbo.modul7.latihan;

public class Spell {
    private String name;
    private boolean isUsed = false;

    //Overloading
    public Spell() {
        this.name = "Unknown spell";
        System.out.println(this.getName() + " on your arm");
    }
    //Overloading
    public Spell(String name) {
        this.name = name;
        System.out.println(this.getName() + " on your arm");
    }

    //getter
    public String getName() {
        return name;
    }

    //Method
    public void use() {
        this.isUsed = true;
        System.out.println(this.getName() + " has been used!");
        this.onUse();
    }

    //Override
    public void onUse() {}
}
