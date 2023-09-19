package DrugaLekcja;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 imie: ");
        String imie1 = scanner.nextLine();
        System.out.println("Podaj jego wynik (min): ");
        double czas1 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Podaj 2 imie: ");
        String imie2 = scanner.nextLine();
        System.out.println("Podaj jego wynik (min): ");
        double czas2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Podaj 3 imie: ");
        String imie3 = scanner.nextLine();
        System.out.println("Podaj jego wynik (min): ");
        double czas3 = scanner.nextDouble();

        if(czas1 < czas2 && czas1 < czas3) {
            System.out.println(imie1);
            if(czas2 < czas3){
                System.out.println(imie2);
                System.out.println(imie3);
            }
            else{
                System.out.println(imie3);
                System.out.println(imie2);
            }

        }

        if(czas2 < czas1 && czas2 < czas3) {
            System.out.println(imie2);
            if(czas1 < czas3){
                System.out.println(imie1);
                System.out.println(imie3);
            }
            else{
                System.out.println(imie3);
                System.out.println(imie1);
            }

        }

        if(czas3 < czas1 && czas3 < czas2) {
            System.out.println(imie3);
            if(czas1 < czas2){
                System.out.println(imie1);
                System.out.println(imie2);
            }
            else{
                System.out.println(imie2);
                System.out.println(imie1);
            }

        }




    }
}
