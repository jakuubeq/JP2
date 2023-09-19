package DrugaLekcja;

import java.util.Scanner;

public class zad18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy ktoras z osob jest na diecie wegetarianskiej? ");
        String wegetarian = scanner.nextLine();

        System.out.println("Czy ktoras z osob jest na diecie weganskiej? ");
        String wegan = scanner.nextLine();

        System.out.println("Czy ktoras z osob jest na diecie bezglutenowej? ");
        String gluten = scanner.nextLine();

        if(wegetarian.equals("tak") && wegan.equals("tak") && gluten.equals("tak")){
            System.out.println("Możesz wybrać się do \"Kawiarnia na Rogu \" ");
            System.out.println("Możesz wybrać się do \"Kuchnia u Szefa \" ");
        }
        else if (wegetarian.equals("nie") && wegan.equals("nie") && gluten.equals("nie")) {
            System.out.println("Możesz wybrać się do \"Luksusowe Burgery u Jarka \" ");
        }
        else if (wegetarian.equals("tak") && wegan.equals("nie") && gluten.equals("nie")) {
            System.out.println("Możesz wybrać się do \"Wloskie Specjaly \" ");
        }
        else if (wegetarian.equals("tak") && wegan.equals("nie")&& gluten.equals("tak")) {
            System.out.println("Możesz wybrać się do \"Pizzeria przy Dworcowej \" ");
        }

    }

    }
