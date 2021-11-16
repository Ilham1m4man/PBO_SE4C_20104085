package com.ilham.pbo.modul7.latihan;

public class Person {
    public static void main(String[] args) {
        Spell spell = new Spell();
        spell.use();

        System.out.println();

        Heal heal = new Heal("Heal");
        heal.use();


    }
}
