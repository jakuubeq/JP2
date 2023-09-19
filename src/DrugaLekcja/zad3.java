package DrugaLekcja;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wage (w kg): ");
        double waga = scanner.nextDouble();

        System.out.println("Podaj wzrost (w metrach): ");
        double wzrost = scanner.nextDouble();


        double  BMI = waga/(wzrost * 2);

        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("Twoj indeks BMI jest optymalny i wynosi on: " + BMI);
        }
        else if (BMI < 18.5) {
            System.out.println("Masz niedowage, a twoj indeks BMI wynosi: " + BMI);
        }
        else{
            System.out.println("Masz nadwage, a twoj indeks BMI wynosi: " + BMI);
        }

    }

}
