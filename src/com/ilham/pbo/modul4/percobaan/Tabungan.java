package com.ilham.pbo.modul4.percobaan;

public class Tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    public Tabungan(String nama, int noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 15000;                 // Nilai default saldo
        this.pin = 11111;               // Nilai default PIN
    }

    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public void tarikUang(int jumlah){
        this.saldo -= jumlah;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void setPin(int pin){
        this.saldo += pin;
    }

    public Tabungan(String nama, int noRekening, int saldo, int pin){
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }


    public String getNama() {
        return this.nama;
    }

    public int getNoRekening() {
        return this.noRekening;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int getPin() {
        return this.pin;
    }

}
