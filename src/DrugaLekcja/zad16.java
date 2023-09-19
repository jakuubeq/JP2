package DrugaLekcja;

import java.util.Scanner;

public class zad16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ilePkt;
        System.out.println("Podaj ile kupiles ksiazek: ");
        int ksiazka = scanner.nextInt();


        if(ksiazka == 0){
            ilePkt = 0;
            System.out.println("Otrzymujesz " + ilePkt + "pkt");
        }
        else if (ksiazka == 1) {
            ilePkt = 5;
            System.out.println("Otrzymujesz " + ilePkt + "pkt");
        }
        else if (ksiazka == 2) {
            ilePkt = 15;
            System.out.println("Otrzymujesz " + ilePkt + "pkt");
        }
        else if (ksiazka == 3) {
            ilePkt = 30;
            System.out.println("Otrzymujesz " + ilePkt + "pkt");
        }
        else if (ksiazka >= 4) {
            ilePkt = 60;
            System.out.println("Otrzymujesz " + ilePkt + "pkt");
        }
    }
}
