package com.ibnu.modul1;

//Class Main / Demo class
public class Objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Ibnu");
        mahasiswaTanpa.setNim(19104020);

        //Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Hoino", 11040201);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());

    }
}
