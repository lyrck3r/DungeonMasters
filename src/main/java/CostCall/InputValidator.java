package CostCall;

import java.util.Scanner;

public class InputValidator {

    public static double readPositiveDouble(Scanner scanner) {
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                if (value <= 0) {
                    throw new IllegalArgumentException();
                }
                scanner.nextLine();
                return value;
            } catch (Exception e) {
                System.out.print("Введіть коректну додатну суму: ");
                scanner.nextLine();
            }
        }
    }

    public static int readMenuChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                return choice;
            } catch (Exception e) {
                System.out.print("Введіть число: ");
                scanner.nextLine();
            }
        }
    }
}
