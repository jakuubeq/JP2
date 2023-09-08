import java.util.Scanner;
public class Zad12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz liczbe przejechanych kilometrow: ");
        double liczbaKilometrow = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ile litrow zuzyles? ");
        double ileLitrow = scanner.nextDouble();

        double kilometryNaLitrze = (int) liczbaKilometrow / ileLitrow;

        System.out.println("Liczba kilometrow przejechanych na litrze wynosi: " + kilometryNaLitrze + '.');


    }

}
