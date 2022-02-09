package JavaOOP.Rumus.Volume.Balok;

import JavaOOP.Rumus.Volume.inRumusVol;

public class VolBalok {
    public static void main(String[] args) {
        inRumusVol vBalok = new inRumusVol();

        vBalok.panjang = 10;
        vBalok.tinggi = 6;
        vBalok.lebar= 3;
        System.out.println("Panjang = " + vBalok.panjang);
        System.out.println("Tinggi = " + vBalok.tinggi);
        System.out.println("Lebar = " + vBalok.lebar);

        vBalok.volBalok();
    }
}
