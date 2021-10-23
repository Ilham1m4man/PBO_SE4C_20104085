package com.ilham.pbo.modul3.percobaan;

public class TesTabungan {
    public static void main(String[] args) {

        // Construct objek 't' dari class 'Tabungan' dengan nilai saldo awal sebesar 5000
        Tabungan t = new Tabungan(5000);

        // Output nilai saldo awal
        System.out.println("Saldo awal Tabungan Anda : " + t.saldo);

        // Panggil method ambilUang()
        t.ambilUang(1500);

        // Output jumlah uang yang diambil
        System.out.println("Jumlah uang yang diambil : 1500");

        // Output sisa uang di tabungan
        System.out.println("Saldo Tabungan Anda sekarang adalah: " + t.saldo);
    }
}
