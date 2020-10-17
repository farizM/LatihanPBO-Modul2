package com.FarizMaulana.Latihan.nomor2;

public class DemoClass {
    public static void main(String[] args) {
        Hewan superClass = new Hewan();
        Burung subClass1 = new Burung("Rajib");
        Ikan subClass2 = new Ikan("Koko");
        Kucing subClass3 = new Kucing("Bobo");

        //Data Hewan
        System.out.println("Sifat alami Hewan");
        superClass.makan = "Hewan selalu Makan";
        superClass.tidur = "Hewan selalu Tidur";
        superClass.printHewan();

        //Hewan Burung
        System.out.println();
        System.out.println("Hewan Burung");
        System.out.println("Nama Hewan : " + subClass1.getNama());
        subClass1.terbang();

        System.out.println();
        System.out.println("Hewan Ikan");
        System.out.println("Nama Hewan : " + subClass2.getNama());
        subClass2.berenang();

        System.out.println();
        System.out.println("Hewan Kucing");
        System.out.println("Nama Hewan : " + subClass3.getNama());
        subClass3.meong();
    }
}
