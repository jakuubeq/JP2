package DrugaLekcja;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile % miales z pierwszego testu: ");
        double test1 = scanner.nextDouble();

        System.out.println("Podaj ile % miales z drugiego testu: ");
        double test2 = scanner.nextDouble();

        System.out.println("Podaj ile % miales z trzeciego testu: ");
        double test3 = scanner.nextDouble();

        int liczbaTestow = 3;
        double srednia = (test1+test2+test3) / liczbaTestow;

        if (srednia >= 90 && srednia <= 100){
            System.out.println("Twoja ocena z testow to 5 z srednia wynoszaca: " + srednia);
        }
        else if (srednia >= 80 && srednia <= 89) {
            System.out.println("Twoja ocena z testow to 4 z srednia wynoszaca: " + srednia);
        }
        else if (srednia >= 70 && srednia <= 79) {
            System.out.println("Twoja ocena z testow to 3 z srednia wynoszaca: " + srednia);
        }
        else if (srednia >= 60 && srednia <= 69) {
            System.out.println("Twoja ocena z testow to 2 z srednia wynoszaca: " + srednia);
        }
        else if (srednia < 60){
            System.out.println("Twoja ocena z testow to 1 z srednia wynoszaca: " + srednia + "popraw sie!!!");
        }

        }
    }
