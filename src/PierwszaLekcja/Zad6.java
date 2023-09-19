package PierwszaLekcja;

public class Zad6 {

    public static void main(String[] args) {

        int pierwszyWymiar = 2;
        int drugiWymiar = 3;
        int trzeciWymiar = 4;
        int osoba = 4;
        int poleJedenDwa = drugiWymiar * trzeciWymiar;
        int poleTrzy = pierwszyWymiar * drugiWymiar;
        int poleCztery = pierwszyWymiar * pierwszyWymiar;
        int powierzchniaCalkowita = poleJedenDwa + poleJedenDwa + poleTrzy + poleCztery;
        int naCztery = powierzchniaCalkowita / osoba;


        System.out.println("2 pomieszczenia mają wymiary" + drugiWymiar + "x" +  trzeciWymiar + "metry, a ich pole wynosi po: " + poleJedenDwa + "m^2");
        System.out.println("3 pomieszczenia ma wymiary" + pierwszyWymiar + "x" + drugiWymiar + "metry, a jego pole wynosi: " + poleTrzy + "m^2");
        System.out.println("3 pomieszczenie ma wymiary" + pierwszyWymiar + "x" + pierwszyWymiar + "metry, a jego pole wynosi: " + poleCztery + "m^2");
        System.out.println("Powierzchnia całkowita mieszkania wynosi: " + powierzchniaCalkowita + "m^2");
        System.out.println("Powierzchnia jaka przypada na jedna osobe wynosi: " + naCztery + "m^2");


    }
}
