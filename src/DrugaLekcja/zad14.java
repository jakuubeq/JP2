package DrugaLekcja;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cena, cenaDruga, nowaCena, minuty1, dodatkoweMinuty, dodatkoweMinutyCena, dodatkoweMinuty1, dodatkoweMinutyCena1;
        System.out.println("Wybierz a b lub c: ");
        String pakiet = scanner.nextLine();
        System.out.println("Wpisz liczbe minut:");
        double minuty = scanner.nextDouble();

        switch(pakiet){
            case "a":
                minuty1 = minuty;
                cena = 39.99;
                dodatkoweMinuty = 450;
                if(dodatkoweMinuty >= minuty){
                    System.out.println("Cena pakietu: " +cena);
                } else if(dodatkoweMinuty < minuty){

                    minuty -= dodatkoweMinuty;
                    dodatkoweMinutyCena = minuty * 0.45;
                    cena += dodatkoweMinutyCena;
                    System.out.println("Masz dostepne " + minuty+ " kosztuja one " + dodatkoweMinutyCena+" a cena koncowa wynosi "
                            + cena);

                }
                cenaDruga = 59.99;
                dodatkoweMinuty1 = 900;

                minuty1 -= dodatkoweMinuty1;
                dodatkoweMinutyCena1 = minuty1 * 0.4;
                cenaDruga += dodatkoweMinutyCena1;


                nowaCena = cena - cenaDruga;
                if(cenaDruga<cena) {
                    System.out.println("Wybierajac pakiet b zaoszczedzilbys: " + nowaCena);
                }

                double cenaC = 69.99;
                nowaCena = cena - cenaC;
                System.out.println("Wybierajac pakiet c zaoszczedzilbys: " + nowaCena);

                break;
            case "b":

                cena = 59.99;
                dodatkoweMinuty = 900;
                if(dodatkoweMinuty >= minuty){
                    System.out.println("Cena pakietu: " +cena);
                } else if(dodatkoweMinuty < minuty) {
                    minuty -= dodatkoweMinuty;
                    dodatkoweMinutyCena = minuty * 0.4;
                    cena += dodatkoweMinutyCena;
                    System.out.println("Masz dostepne " + minuty + " kosztuja one " + dodatkoweMinutyCena + " a cena koncowa wynosi "
                            + cena);

                }

                break;



            case "c":
                cena = 69.99;
                System.out.println("Cena pakietu: " +cena);

                break;

        }


    }
}
