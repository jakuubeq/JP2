package DrugaLekcja;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        double dystans1;


        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wagę przesyłki w kilogramach: ");
        double waga = klawiatura.nextDouble();

        System.out.println("Podaj odległość przesyłki w kilometrach: ");
        double dystans = klawiatura.nextDouble();
        dystans1 = dystans/500;

        double koszt = 0.0;

        if (waga <= 1.0) {
            koszt = 1.10 * Math.ceil(dystans1);
        } else if (waga <= 3.0) {
            koszt = 2.20 * Math.ceil(dystans1);
        } else if (waga <= 5.0) {
            koszt = 3.70 * Math.ceil(dystans1);
        } else {
            koszt = 3.80 * Math.ceil(dystans1);
        }


        System.out.println("Koszt przesyłki wynosi: " + koszt + " złotych.");
    }
}


