package DrugaLekcja;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzien: ");
        int dzien = scanner.nextInt();

        System.out.println("Podaj miesiac: ");
        int miesiac = scanner.nextInt();

        System.out.println("Podaj rok (dwie ostatnie cyfry): ");
        int rok = scanner.nextInt();

        int iloczynDniaIMiesiaca = miesiac * dzien;


        if (iloczynDniaIMiesiaca == rok){
            System.out.println("Twoja data jest MAGICZNA!");
        }
        else {
            System.out.println("Twoja data nie jest magiczna :( ");
        }
    }

}
