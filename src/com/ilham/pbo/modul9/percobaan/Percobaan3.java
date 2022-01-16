package com.ilham.pbo.modul9.percobaan;

public class Percobaan3 {
    public static void main(String[] args) {
        int c = 10;
        int[] d = new int[5];

        try {
            System.out.println(c / 0);
            System.out.println(d[3]);
        }

        catch (ArithmeticException e) {
            System.out.println("Indeks");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebihi batas maksimal!");
        }

        catch (Exception e) {
            System.out.println("Terjadi sebuah error!");
        }
    }
}