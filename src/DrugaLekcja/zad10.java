package DrugaLekcja;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double kalorieZTluszczu;
        double procentKaloriZTluszczu;
        System.out.println("Wpisz kalorie: ");
        double kcal = klawiatura.nextDouble();
        System.out.println("Podaj ilosc gramow tluszczu: ");
        double gramyTluszczu = klawiatura.nextDouble();

        kalorieZTluszczu = gramyTluszczu * 9;
        procentKaloriZTluszczu = (kalorieZTluszczu / kcal) * 100;

        if(procentKaloriZTluszczu < 30){
            System.out.println(procentKaloriZTluszczu +  " Produkt jest niskotluszczowy ");
        }
        else if(kalorieZTluszczu > kcal){
            System.out.println("Dane wyjsciowe sa nieprawidlowe! Natepnym razem sie popraw!!!");
        }
        else if(procentKaloriZTluszczu >= 30){
            System.out.println(procentKaloriZTluszczu + " Produkt jest wysoko tłuszczowy ");
        }

    }
}
