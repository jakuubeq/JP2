import java.util.Scanner;
public class Zad11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        System.out.print("Wprowadz wartosc kupowanego produktu: ");
        double wartoscProduktu = scanner.nextDouble();

        double lacznaCena = wartoscProduktu - (podatekStanowy * podatekLokalny);

        System.out.println("Podatek stanowy wynosi: " + podatekStanowy + ", podatek lokalny wynosi: " + podatekLokalny +
                ", wartosc produktu wynosi: " + wartoscProduktu + ", a laczna cena jest rowna: " + lacznaCena);

    }

}
