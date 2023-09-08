import java.util.Scanner;
public class Zad10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String firstName = scanner.nextLine();

        System.out.print("Podaj drugi imie: ");
        String middleName = scanner.nextLine();

        System.out.print("Podaj Nazwisko: ");
        String lastName = scanner.nextLine();


        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastnitial = lastName.charAt(0);

        System.out.println("Twoje imie to: " + firstName + ", drugie " + middleName + ", a nazwisko to " + lastName +
                ". Pierwszy inicjał twojego imienia to: " + firstInitial + ", pierwszy inicjał drugiego imienia " + middleInitial +
                ", a pierwszy inicjał twojego nazwiska to " + lastnitial + '.');

    }

}
