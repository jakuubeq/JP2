package PierwszaLekcja;//08.09.2023 rok
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie i nazwisko: ");
        String imieNazwisko = scanner.nextLine();

        System.out.println("Nazywasz sie: " + imieNazwisko);

        System.out.print("Podaj ulice: ");
        String ulica = scanner.nextLine();

        System.out.print("Podaj numer domu: ");
        int nrDomu = scanner.nextInt();

        System.out.print("Podaj numer mieszkania: ");
        int nrMieszkania = scanner.nextInt();

        System.out.print("Twoja ulica to: " + ulica + ", numer domu " + nrDomu + ", numer mieszkania " + nrMieszkania + ".\n" );

        scanner.nextLine();

        System.out.print("Podaj miasto: ");
        String miasto = scanner.nextLine();

        System.out.print("Podaj kod pocztowy: ");
        String kod = scanner.nextLine();

        System.out.print("Miasto to: " + miasto + ", a kod pocztowy " + kod +  ". \n" );

        System.out.print("Podaj numer telefonu: ");
        int nrTel = scanner.nextInt();

        System.out.print("Numer: " + nrTel +  "." );


    }

}
