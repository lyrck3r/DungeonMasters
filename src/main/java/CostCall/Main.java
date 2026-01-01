package CostCall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n--- КАЛЬКУЛЯТОР ВИТРАТ ---");
            System.out.println("1. Додати витрату");
            System.out.println("2. Показати всі витрати");
            System.out.println("3. Загальна сума");
            System.out.println("4. Сума по категорії");
            System.out.println("5. Видалити витрату");
            System.out.println("0. Вийти");
            System.out.print("Ваш вибір: ");

            int choice = InputValidator.readMenuChoice(scanner);

            switch (choice) {
                case 1 -> {
                    System.out.print("Назва: ");
                    String name = scanner.nextLine();

                    System.out.print("Сума: ");
                    double amount = InputValidator.readPositiveDouble(scanner);

                    System.out.print("Категорія (FOOD, TRANSPORT, ENTERTAINMENT, OTHER): ");
                    Category category = Category.fromString(scanner.nextLine());

                    manager.addExpense(name, amount, category);
                    System.out.println("Витрату додано");
                }

                case 2 -> manager.showAllExpenses();
                case 3 -> System.out.println("Загальні витрати: " + manager.getTotal() + " грн");

                case 4 -> {
                    System.out.print("Категорія: ");
                    Category category = Category.fromString(scanner.nextLine());
                    System.out.println("Сума: " + manager.getTotalByCategory(category) + " грн");
                }

                case 5 -> {
                    manager.showAllExpenses();
                    System.out.print("Номер витрати: ");
                    int index = InputValidator.readMenuChoice(scanner);
                    manager.removeExpense(index);
                }

                case 0 -> {
                    System.out.println("До побачення!");
                    return;
                }

                default -> System.out.println("Невірний вибір");
            }
        }
    }
}
