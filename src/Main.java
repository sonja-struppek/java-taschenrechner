import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

    while (weiter) {
        System.out.println("Wähle eine Operation:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraktion");
        System.out.println("3: Multiplikation");
        System.out.println("4: Division");
        System.out.println();
        System.out.println("0: Beenden");

        int choice = readMenuChoice(scanner);

        if (choice == 0) {
            System.out.println("Programm beendet.");
            break;
        }

        System.out.println("Zahl 1: ");
        double a = readDouble(scanner);

        System.out.println("Zahl 2: ");
        double b = readDouble(scanner);

        double result = 0;

        switch (choice) {
            case 1:
                result = add(a, b);
                break;
            case 2:
                result = subtract(a, b);
                break;
            case 3:
                result = multiply(a, b);
                break;
            case 4:
                result = divide(a, b, scanner);
                break;
            default:
                System.out.println("Ungültige Auswahl.");
                continue; //zurück ins Menü
        }
        System.out.println("Ergebnis: " + result);

        System.out.print("Weitere Berechnung durchführen? (j/n): ");
        String antwort = scanner.next();

        if (!antwort.equalsIgnoreCase("j")) {
            weiter = false;
        }

        System.out.println();
    }
    scanner.close();
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b, Scanner scanner) {
        while (b == 0) {
            System.out.println("Fehler: Division durch 0 ist nicht erlaubt.");
            System.out.print("Bitte gib eine neue Zahl für b ein: ");
            b = scanner.nextDouble();
        }

        return a / b;
    }
    public static double readDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl ein:");
                scanner.next(); // ungültige Eingabe verwerfen
            }
        }
    }

    public static int readMenuChoice(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 0 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("Ungültige Auswahl! Bitte 0–4 eingeben:");
                }
            } else {
                System.out.println("Ungültige Eingabe! Bitte eine Zahl eingeben:");
                scanner.next(); // ungültige Eingabe verwerfen
            }
        }
    }


}
