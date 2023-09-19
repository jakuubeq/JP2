package DrugaLekcja;

import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj mase obiektu: ");
        double masa = scanner.nextDouble();
        double ciezar = masa * 9.8;

        if (ciezar > 1000){
            System.out.println("Obiekt jest zbyt ciezki, ciezar wynosi: " + ciezar + " N");
        }
        else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki, ciezar wynosi: " + ciezar + " N");
        }
        else{
            System.out.println("Obiekt jest odpowiedni, ciezar wynosi: " + ciezar + " N");
        }
        }
    }
