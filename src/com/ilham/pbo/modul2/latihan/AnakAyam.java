package com.ilham.pbo.modul2.latihan;

import java.io.IOException;

public class AnakAyam {
    public static void main(String[] args) throws IOException {
        System.out.println("-=-=-=Anak Ayam=-=-=-");
        System.out.println("Tekan [enter] untuk lanjutkan!");
        int cha = System.in.read();

        for (int x = 10; x > 0; x--) {
            System.out.println("Anak ayam turun " + x);
            if (x == 1) {
                System.out.println("Mati 1 tinggal induknya");
            }else {
                System.out.println("Mati 1 tinggal " + (x - 1));
            }
            int cha1 = System.in.read();
        }
    }
}
