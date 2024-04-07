import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> oceny = new ArrayList<>();

        System.out.println("Dodawanie ocen. Wpisz 'koniec', aby zakończyć.");

        String wprowadzonaOcena;
        while (true) {
            System.out.print("Podaj ocenę: ");
            wprowadzonaOcena = scanner.nextLine();

            if (wprowadzonaOcena.equals("koniec")) {
                break;
            }

            try {
                double ocena = Double.parseDouble(wprowadzonaOcena);
                if (ocena > 0 && ocena < 6) {
                    oceny.add(ocena);
                } else {
                    System.out.println("Ocena powinna być dodatnia i mniejsza od 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy format oceny.");
            }
        }

        if (!oceny.isEmpty()) {
            double suma = 0;
            for (double ocena : oceny) {
                suma += ocena;
            }
            double srednia = suma / oceny.size();
            System.out.println("Średnia ocen: " + srednia);
        } else {
            System.out.println("Nie wprowadzono żadnych ocen.");
        }
    }
}
