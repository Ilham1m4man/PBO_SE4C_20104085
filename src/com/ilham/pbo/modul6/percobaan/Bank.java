package com.ilham.pbo.modul6.percobaan;

public class Bank {
    public static void main(String[] args) {

        // Pembuatan object baru dari class Tabungan
        Tabungan saya = new Tabungan("Barca",
                50410420,
                1_000_000,
                123345
        );

        // Demonstrator method Getter
        System.out.println("Nama\t\t : " + saya.getNama());
        System.out.println("noRekening\t : " + saya.getNoRekening());
        System.out.println("saldo\t\t : " + saya.getSaldo());
        System.out.println("pin\t\t\t : " + saya.getPin());

        System.out.println();

        Tabungan saya1 = new Tabungan("Barca", 12345);
        Tabungan kamu1 = new Tabungan("Manu",
                12467,
                15000,
                22222);

        saya1.tarikUang(5000);

        System.out.println("Saldo awal saya : " + saya1.getSaldo());
        System.out.println("Saldo awal kamu : " + kamu1.getSaldo());
        System.out.println("Nomor pin saya : " + saya1.getPin());
        System.out.println("Nomor pin kamu : " + kamu1.getPin());


    }
}
