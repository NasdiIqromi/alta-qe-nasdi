package JavaOOP.kalkulator.APP;

import JavaOOP.kalkulator.rumus.formula;

public class CalculatorAPP {
    public static void main(String[] args) {
        formula Formula = new formula();

        Formula.tambahA = 3;
        Formula.tambahB = 4;
        System.out.println("---PENJUMLAHAN---");
        System.out.println("Nilai A = " + Formula.tambahA);
        System.out.println("Nilai B = " + Formula.tambahB);
        Formula.jumTambah();

        Formula.kurangA = 15;
        Formula.kurangB = 4;
        System.out.println("---PENGURANGAN---");
        System.out.println("Nilai A = " + Formula.kurangA);
        System.out.println("Nilai B = " + Formula.kurangB);
        Formula.jumKurang();

        Formula.kaliA = 10;
        Formula.kaliB = 10;
        System.out.println("---PERKALIAN---");
        System.out.println("Nilai A = " + Formula.kaliA);
        System.out.println("Nilai B = " + Formula.kaliB);
        Formula.jumKali();

        Formula.bagiA = 12;
        Formula.bagiB = 3;
        System.out.println("---PEMBAGIAN---");
        System.out.println("Nilai A = " + Formula.bagiA);
        System.out.println("Nilai B = " + Formula.bagiB);
        Formula.jumbagi();
    }
}
