package com.FarizMaulana.Latihan.nomor3;

public class Pacar extends Mahasiswa{
    String namaPacar, lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    public void tampilData(){
        System.out.println("Nama Pacar : " + namaPacar);
        System.out.println("Lama hubungan : " + lamaHubungan);
    }
}
