package com.FarizMaulana.Latihan.nomor1;

public class Club {
    public String nama, stadion, deskripsi;
    public int tahunBerdiri, juaraUCL;

    public Club(String nama) {
        this.nama = nama;
        this.stadion = "tidak di ketahui";
        this.deskripsi = "tidak di ketahui";
        this.tahunBerdiri = 0;
        this.juaraUCL = 0;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.stadion = "tidak di ketahui";
        this.tahunBerdiri = 0;
        this.juaraUCL = 0;
    }

    public Club(String nama, String stadion, int tahunBerdiri) {
        this.nama = nama;
        this.stadion = stadion;
        this.tahunBerdiri = tahunBerdiri;
        this.deskripsi = "tidak di ketahui";
        this.juaraUCL = 0;
    }

    public Club(String nama, String stadion, String deskripsi, int tahunBerdiri, int juaraUCL) {
        this.nama = nama;
        this.stadion = stadion;
        this.deskripsi = deskripsi;
        this.tahunBerdiri = tahunBerdiri;
        this.juaraUCL = juaraUCL;
    }

    public void getDataCLub(){
        System.out.println("Nama Club : " + nama);
        System.out.println("Deskripsi Club : " + deskripsi);
        System.out.println("Stadion Club : " + stadion);
        System.out.println("Tahun Berdiri Club : " + tahunBerdiri);
        System.out.println("Total Juara UCL Club : " + juaraUCL);
    }
}
