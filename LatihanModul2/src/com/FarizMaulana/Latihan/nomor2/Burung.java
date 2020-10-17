package com.FarizMaulana.Latihan.nomor2;

public class Burung extends Hewan {
    String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void terbang(){
        System.out.println("Burung Terbang");
    }

}
