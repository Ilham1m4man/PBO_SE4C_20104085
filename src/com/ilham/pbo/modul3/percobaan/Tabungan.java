package com.ilham.pbo.modul3.percobaan;

public class Tabungan {

    // Attribute
    public int saldo;

    // Constructor method
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    // Method
    public void ambilUang(int jumlah){
        saldo -= jumlah;
    }
}
