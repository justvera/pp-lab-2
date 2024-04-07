import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zadanie5 {
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

            Collections.sort(oceny);
            double mediana;
            int rozmiar = oceny.size();
            if (rozmiar % 2 == 0) {
                mediana = (oceny.get(rozmiar / 2 - 1) + oceny.get(rozmiar / 2)) / 2;
            } else {
                mediana = oceny.get(rozmiar / 2);
            }
            System.out.println("Mediana ocen: " + mediana);
        } else {
            System.out.println("Nie wprowadzono żadnych ocen.");
        }
    }
}
