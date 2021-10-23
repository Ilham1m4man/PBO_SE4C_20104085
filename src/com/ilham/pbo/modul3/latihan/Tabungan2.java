package com.ilham.pbo.modul3.latihan;

public class Tabungan2 {

    // Attribute
    public int saldo;

    // Constructor method
    public Tabungan2(int saldo){
        this.saldo = saldo;
    }

    // Method
    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah){
        if ((jumlah % 200 == 100) || jumlah == 500 || jumlah > saldo){
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }

    }
}
