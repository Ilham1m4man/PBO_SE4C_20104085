package com.ilham.pbo.modul5.latihan;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAkhir = namaAkhir;
        this.namaAwal = namaAwal;
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
