import java.util.Scanner;
public class Zad23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dluogosc rzedu w metrach: ");
        double R = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Podaj ilosc miejsca zajmowanego przez okratowanie: ");
        int E = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Podaj odleglosc miedzy sadzonkami w metrach: ");
        double S = scanner.nextDouble();

        double V =(int) (R - 2 * E) / S;

        System.out.println(V + "to liczba sadzoenk jakie sie zmieszcza w rzedie.");


    }

}
