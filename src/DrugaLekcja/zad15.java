package DrugaLekcja;

import java.util.Scanner;

public class zad15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double cena;
        int podstawowa = 10;
        System.out.println("Podaj liczbe czekow: ");
        int czek = scanner.nextInt();


        if(czek < 20){
            cena = podstawowa + czek * 0.10;
            System.out.println(cena + "zl, to oplaty pobrane w danym miesiacu");
        }
        else if (czek >= 20 && czek <= 39) {
            cena = podstawowa + czek * 0.08;
            System.out.println(cena + "zl, to oplaty pobrane w danym miesiacu");
        }
        else if (czek >= 40 && czek <= 59) {
            cena = podstawowa + czek * 0.06;
            System.out.println(cena + "zl, to oplaty pobrane w danym miesiacu");
        }
        else if (czek >= 60){
            cena = podstawowa + czek * 0.04;
            System.out.println(cena + "zl, to oplaty pobrane w danym miesiacu");
        }
    }
    }
