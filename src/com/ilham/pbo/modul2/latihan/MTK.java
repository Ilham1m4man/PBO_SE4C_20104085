package com.ilham.pbo.modul2.latihan;

import java.util.Scanner;

public class MTK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Banyaknya Testcase: ");
        int test = s.nextInt();
        int[] hasil = new int[test];

        for (int a = 0; a < test; a++) {
                System.out.print("Nilai A"+(a+1)+" = ");
                int A = s.nextInt();
                System.out.print("Nilai B"+(a+1)+" = ");
                int B = s.nextInt();
                System.out.print("Nilai C"+(a+1)+" = ");
                int C = s.nextInt();
                hasil[a] = A + B - C;
            System.out.println();
        }

        System.out.println("Hasil");
        for (int b = 0; b < test; b++) {
            System.out.println(("A"+(b+1)+"+B"+(b+1)+"-C"+(b+1))+
                    "= "+hasil[b]);
        }
    }
}
