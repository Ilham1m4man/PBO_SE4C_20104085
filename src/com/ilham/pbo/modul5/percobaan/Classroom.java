package com.ilham.pbo.modul5.percobaan;

public class Classroom {
    private int classCode;
    private String className;
    private Mahasiswa mahasiswa;

    public Classroom(int classCode, String className) {
        this.classCode = classCode;
        this.className = className;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public int getClassCode() {
        return classCode;
    }

    public String getClassName() {
        return className;
    }

    public String getNamaMahasiswa() {
        return mahasiswa.getNama();
    }
}
