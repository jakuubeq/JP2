package DrugaLekcja;

import java.util.Scanner;

public class zad6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe sekund: ");
        int sekundy = scanner.nextInt();
        int dni = sekundy / 86400;
        int reszta1 = sekundy % 86400;
        int godziny = reszta1 / 3600;
        int reszta2 = sekundy % 3600;
        int minuty = reszta2 / 60;

        System.out.println(sekundy + " sekund to: " + dni + " dni i " + godziny + " godzin i " + minuty + " minut");

    }

    }
