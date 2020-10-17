package com.FarizMaulana.Latihan.nomor3;

public class DemoClass {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Rajib", "Berpacaran", 6);
        Pacar pacar = new Pacar("Rajib", "Berpacaran", 6, "Rin", "1 Dekade");

        pacar.getStatus();
        mahasiswa.tampilData();
        pacar.tampilData();
    }
}
