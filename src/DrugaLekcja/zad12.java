package DrugaLekcja;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double czas;
        System.out.println("Wpisz \"powietrze\", \"woda\" lub \"stal\": ");
        String wybor = scanner.nextLine();

        System.out.println("Podaj odleglosc: ");
        double odleglosc = scanner.nextDouble();

        switch(wybor){
            case "powietrze":
                czas = odleglosc/343;
                System.out.println(czas + "s, To czas potrzebny do pokonania powyzszej odleglosci w powietzru");
                break;
            case "woda":
                czas = odleglosc/1490;
                System.out.println(czas + "s, To czas potrzebny do pokonania powyzszej odleglosci w wodzie");
                break;
            case "stal":
                czas = odleglosc/5100;
                System.out.println(czas + "s, To czas potrzebny do pokonania powyzszej odleglosci w stali");
                break;
        }



    }


}
