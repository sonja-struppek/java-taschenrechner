import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl 1: ");
        double a = scanner.nextDouble();

        System.out.print("Zahl 2: ");
        double b = scanner.nextDouble();

        double result = a - b;
        System.out.println("Ergebnis: " + result);
    }
}
