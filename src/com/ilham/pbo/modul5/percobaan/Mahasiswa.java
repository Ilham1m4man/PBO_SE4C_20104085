package com.ilham.pbo.modul5.percobaan;

public class Mahasiswa {
    private int nrp;
    private String nama;

    /*
        public Mahasiswa() {
            this.nrp = 0;
            this.nama = "null";
        }
        public Mahasiswa(String nama){
            this.nama = nama;
            this.nrp = 0;
        }
    */

    public Mahasiswa(){
        this(0, "null");
    }

    public Mahasiswa(String nama){
        this(0, nama);
    }

    public Mahasiswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }
}
