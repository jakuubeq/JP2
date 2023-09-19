package PierwszaLekcja;

public class Zad5 {

    public static void main(String[] args) {

        int poleJedenDwa = 3 * 4;
        int poleTrzy = 2 * 3;
        int poleCztery = 2 * 2;
        int powierzchniaCalkowita = poleJedenDwa + poleJedenDwa + poleTrzy + poleCztery;

        System.out.println("2 pomieszczenia mają wymiary 3 x 4 metry, a ich pole wynosi po: " + poleJedenDwa + "m^2");
        System.out.println("3 pomieszczenia ma wymiary 2 x 3 metry, a jego pole wynosi: " + poleTrzy + "m^2");
        System.out.println("3 pomieszczenie ma wymiary 2 x 2 metry, a jego pole wynosi: " + poleCztery + "m^2");
        System.out.println("Powierzchnia całkowita mieszkania wynosi: " + powierzchniaCalkowita + "m^2");

    }
}
