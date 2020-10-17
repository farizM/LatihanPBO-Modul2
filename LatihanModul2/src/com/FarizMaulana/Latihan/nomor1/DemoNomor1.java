package com.FarizMaulana.Latihan.nomor1;

public class DemoNomor1 {
    public static void main(String[] args) {
        Club club1 = new Club("Arsenal");
        Club club2 = new Club("Arsenal", "Club London");
        Club club3 = new Club("Arsenal", "Emirates Stadion", 1910);
        Club club4 = new Club("Arsenal", "Emirates", "CLub london", 1910, 2);

        club1.getDataCLub();
        System.out.println();
        club2.getDataCLub();
        System.out.println();
        club3.getDataCLub();
        System.out.println();
        club4.getDataCLub();
        System.out.println();

    }
}
