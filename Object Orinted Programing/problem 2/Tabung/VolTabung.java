package JavaOOP.Rumus.Volume.Tabung;

import JavaOOP.Rumus.Volume.inRumusVol;

public class VolTabung {
    public static void main(String[] args) {
        inRumusVol vtabung = new inRumusVol();

        vtabung.jarijari = 7;
        vtabung.Tabtinggi = 10;
        System.out.println("Jari-jari = " + vtabung.jarijari);
        System.out.println("Tinggi tabung = " + vtabung.Tabtinggi);

        vtabung.volTabung();
    }
}
