package com.ilham.pbo.modul7.latihan;

public class Heal extends Spell{

    //Overload
    public Heal() {
    }

    //Overload
    public Heal(String name) {
        super(name);
    }

    //Override
    public void onUse() {
        System.out.println(this.getName() + " healing your wound!");
    }
}
