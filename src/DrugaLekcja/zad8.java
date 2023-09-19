package DrugaLekcja;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaPakietu=99;
        double cena;
        System.out.println("Podaj liczbe zakupionych pakietow: ");
        double pakiety = scanner.nextDouble();
        if(pakiety >= 10 && pakiety <= 19){
            cena = 0.8 * (pakiety * cenaPakietu);
            System.out.println("Rabat wynosi 20%, cena wynosi: " + cena );
        }
        else if(pakiety >= 20 && pakiety <= 49){
            cena = 0.7 * (pakiety * cenaPakietu);
            System.out.println("Rabat wynosi 30%, cena wynosi: " + cena );
        }
        else if(pakiety >= 50 && pakiety <= 99){
            cena = 0.6 * (pakiety * cenaPakietu);
            System.out.println("Rabat wynosi 40%, cena wynosi: " + cena );
        }
        else if(pakiety >= 100){
            cena = 0.5 * (pakiety * cenaPakietu);
            System.out.println("Rabat wynosi 50%, cena wynosi " + cena );
        }
        else{
            System.out.println("Brak rabatu, cena wynosi: " + (cenaPakietu*pakiety));
        }
    }
}
