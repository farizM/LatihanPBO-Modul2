package com.FarizMaulana.Latihan.nomor3;

public class Mahasiswa {
    String nama, status;
    int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public String getStatus() {
        return status;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + status);
        System.out.println("Semester : " + semester);
    }
}
