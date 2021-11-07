package com.ilham.pbo.modul5.percobaan;

public class School {
    public static void main(String[] args) {
        //Classroom constructors
        Classroom classA = new Classroom(101, "Class 101");
        Classroom classB = new Classroom(102, "Class 102");
        Classroom classC = new Classroom(103, "Class 103");

        //Mahasiswa constructors
        Mahasiswa mhsA = new Mahasiswa();
        Mahasiswa mhsB = new Mahasiswa("Pyra");
        Mahasiswa mhsC = new Mahasiswa(10101, "Mythara");

        //Assign mahasiswa to classroom
        classA.setMahasiswa(mhsA);
        classB.setMahasiswa(mhsB);
        classC.setMahasiswa(mhsC);

        //Output Class A
        System.out.println(classA.getClassName());
        System.out.println("Class code: "+classA.getClassCode());
        System.out.println("Mahasiswa : "+classA.getNamaMahasiswa());
        System.out.println();

        //Output Class B
        System.out.println(classB.getClassName());
        System.out.println("Class code: "+classB.getClassCode());
        System.out.println("Mahasiswa : "+classB.getNamaMahasiswa());
        System.out.println();

        //Output Class C
        System.out.println(classC.getClassName());
        System.out.println("Class code: "+classC.getClassCode());
        System.out.println("Mahasiswa : "+classC.getNamaMahasiswa());
        System.out.println();
    }
}
