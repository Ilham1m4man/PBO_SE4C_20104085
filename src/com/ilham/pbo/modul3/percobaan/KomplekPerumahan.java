package com.ilham.pbo.modul3.percobaan;

public class KomplekPerumahan {
    public static void main(String[] args) {

        //Construct object 'r' dari class 'Rumah'
        Rumah r = new Rumah();

        // Memanggil method 'setAlamat()' milik objek 'r'
        r.setAlamatRumah("Alamat saya di Jalan Pramuka");

        // Melihat isi attribute 'alamatRumah' milik objek 'r'
        System.out.println(r.alamatRumah);
    }
}
