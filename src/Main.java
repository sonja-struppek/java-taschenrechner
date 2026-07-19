import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl 1: ");
        double a = scanner.nextDouble();

        double b;

        do {
            System.out.print("Zahl 2: ");
            b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Fehler: Division durch 0 ist nicht erlaubt. Bitte gib einen gültigen Wert ein.");
            }

        } while (b == 0);


        double result = a / b;
        System.out.println("Ergebnis: " + result);
    }
}
