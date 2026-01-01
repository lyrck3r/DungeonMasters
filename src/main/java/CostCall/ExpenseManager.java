package CostCall;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(String name, double amount, Category category) {
        expenses.add(new Expense(name, amount, category, LocalDate.now()));
    }

    public void showAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("Витрат немає");
            return;
        }
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((i + 1) + ". " + expenses.get(i));
        }
    }

    public double getTotal() {
        return expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public double getTotalByCategory(Category category) {
        return expenses.stream()
                .filter(e -> e.getCategory() == category)
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public void removeExpense(int index) {
        if (index < 1 || index > expenses.size()) {
            System.out.println("Невірний номер");
            return;
        }
        expenses.remove(index - 1);
        System.out.println("Витрату видалено");
    }
}
