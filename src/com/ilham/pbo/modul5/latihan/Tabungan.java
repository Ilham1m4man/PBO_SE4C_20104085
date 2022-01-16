package com.ilham.pbo.modul5.latihan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah > saldo){
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
}
