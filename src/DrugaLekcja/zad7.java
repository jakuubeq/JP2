package DrugaLekcja;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 imie: ");
        String imie1 = scanner.nextLine();
        System.out.println("Podaj 2 imie: ");
        String imie2 = scanner.nextLine();
        System.out.println("Podaj 3 imie: ");
        String imie3 = scanner.nextLine();
        if(imie1.compareTo(imie2) < 0 && imie1.compareTo(imie3) < 0) {
            System.out.println(imie1);
            if(imie2.compareTo(imie3) < 0){
                System.out.println(imie2);
                System.out.println(imie3);
            }
            else{
                System.out.println(imie3);
                System.out.println(imie2);
            }

        }

        if(imie2.compareTo(imie1) < 0 && imie2.compareTo(imie3) < 0) {
            System.out.println(imie2);
            if(imie1.compareTo(imie3) < 0){
                System.out.println(imie1);
                System.out.println(imie3);
            }
            else{
                System.out.println(imie3);
                System.out.println(imie1);
            }

        }

        if(imie3.compareTo(imie1) < 0 && imie3.compareTo(imie2) < 0) {
            System.out.println(imie3);
            if(imie1.compareTo(imie2) < 0){
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
