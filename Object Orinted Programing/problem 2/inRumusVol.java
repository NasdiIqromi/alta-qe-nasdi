package JavaOOP.Rumus.Volume;

public class inRumusVol {
    public int panjang, lebar, tinggi;
    public void volBalok(){
        System.out.println("Volume Balok = " + panjang * lebar * tinggi);
    }

    public int sisi;
    public void volKubus(){
        System.out.println("Volume Kubus = " + sisi * sisi * sisi);
    }

    public int jarijari, Tabtinggi;
    public void volTabung(){
        System.out.println("Volume Tabung = " + 22  * jarijari / 7 * jarijari * Tabtinggi);
    }

}
