import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź oceny z przedmiotów oddzielone spacją:");
        String[] ocenyString = scanner.nextLine().split(" ");

        double suma = 0;
        int iloscOcen = ocenyString.length;

        for (String ocena : ocenyString) {
            suma += Double.parseDouble(ocena);
        }

        double srednia = suma / iloscOcen;
        System.out.println("Średnia ocen: " + srednia);
    }
}