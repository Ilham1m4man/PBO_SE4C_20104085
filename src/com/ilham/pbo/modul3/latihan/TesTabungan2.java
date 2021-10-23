package com.ilham.pbo.modul3.latihan;

public class TesTabungan2 {
    public static void main(String[] args) {

        boolean status;

        Tabungan2 tabungan2 = new Tabungan2(10000);
        System.out.println("Saldo awal : "+tabungan2.getSaldo());

        tabungan2.simpanUang(8000);
        System.out.println("Jumlah uang yang disimpan\t: 8000");

        status = tabungan2.ambilUang(7000);
        System.out.print("Jumlah uang yang diambil\t: 7000");
        {if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");}

        tabungan2.simpanUang(1000);
        System.out.println("Jumlah uang yang disimpan\t: 1000");

        status = tabungan2.ambilUang(10000);
        System.out.print("Jumlah uang yang diambil\t: 10000");
        {if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");}

        status = tabungan2.ambilUang(2500);
        System.out.print("Jumlah uang yang diambil\t: 2500");
        {if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");}

        tabungan2.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan\t: 2000");

        System.out.println("Saldo sekarang = " + tabungan2.getSaldo());
    }
}
