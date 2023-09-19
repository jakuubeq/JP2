package DrugaLekcja;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cena, dodatkoweMinuty, dodatkoweMinutyCena;
        System.out.println("Wybierz a b lub c: ");
        String pakiet = scanner.nextLine();
        System.out.println("Wpisz liczbe minut:");
        double minuty = scanner.nextDouble();

        switch(pakiet){
            case "a":
                cena = 39.99;
                dodatkoweMinuty = 450;
                if(dodatkoweMinuty >= minuty){
                    System.out.println(cena);
                } else if(dodatkoweMinuty < minuty){
                    minuty -= dodatkoweMinuty;
                    dodatkoweMinutyCena = minuty * 0.45;
                    cena += dodatkoweMinutyCena;
                    System.out.println("Masz dostepne " + minuty+ " kosztuja one " + dodatkoweMinutyCena+" a cena koncowa wynosi "
                            + cena);
                }
                break;


                case "b":
                cena = 59.99;
                dodatkoweMinuty = 900;
                if(dodatkoweMinuty >= minuty){
                    System.out.println(cena);
                } else if(dodatkoweMinuty < minuty){
                    minuty -= dodatkoweMinuty;
                    dodatkoweMinutyCena = minuty * 0.4;
                    cena += dodatkoweMinutyCena;
                    System.out.println("Masz dostepne " + minuty+ " kosztuja one " + dodatkoweMinutyCena+" a cena koncowa wynosi "
                            + cena);
                }
                break;


                case "c":
                cena = 69.99;
                System.out.println("Cena: " + cena);

                break;

        }

    }
}
