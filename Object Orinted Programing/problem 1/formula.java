package JavaOOP.kalkulator.rumus;

public class formula {
    public int tambahA, tambahB;
    public void jumTambah(){
        System.out.println("Hasil = " + (tambahA + tambahB));
    }

    public int kurangA, kurangB;
    public void jumKurang(){
        System.out.println("Hasil = " + (kurangA - kurangB));
    }
    public int kaliA, kaliB;
    public void jumKali(){
        System.out.println("Hasil = " + kaliA * kaliB);
    }

    public int bagiA, bagiB;
    public void jumbagi(){
        System.out.println("Hasil = " + bagiA / bagiB);
    }
}
