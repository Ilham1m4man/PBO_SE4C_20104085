package com.ilham.pbo.modul2.percobaan;

public class DataType {
    public static void main(String[] args) {
        long data1 = 767226531;         //Bilangan bulat
        int data2 = 2235641;            //Bilangan bulat
        short data3 = 714;              //Bilangan bulat
        byte data4 = 34;                //Bilangan bulat

        float data6 = (float) 1.733;    //Bilangan desimal
        double data5 = 4.967;           //Bilangan desimal

        char data7 = 'C';               //Hanya berisi 1 huruf/angka/karakter
        boolean data8 = true;           //Hanya berisi True atau False saja

        System.out.println("Nilai Long      : " + data1);
        System.out.println("Nilai Int       : " + data2);
        System.out.println("Nilai Short     : " + data3);
        System.out.println("Nilai Byte      : " + data4);
        System.out.println("Nilai Double    : " + data5);
        System.out.println("Nilai Float     : " + data6);
        System.out.println("Nilai Char      : " + data7);
        System.out.println("Nilai Boolean   : " + data8);
    }
}
