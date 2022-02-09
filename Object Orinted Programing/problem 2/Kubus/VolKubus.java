package JavaOOP.Rumus.Volume.Kubus;

import JavaOOP.Rumus.Volume.inRumusVol;

public class VolKubus {
    public static void main(String[] args) {

        inRumusVol vkubus = new inRumusVol();

        vkubus.sisi = 10;
        System.out.println("Sisi = " + vkubus.sisi);

        vkubus.volKubus();
    }
}
