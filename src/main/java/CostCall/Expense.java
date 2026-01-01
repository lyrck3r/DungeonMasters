package CostCall;

import java.time.LocalDate;

public class Expense {
    private String name;
    private double amount;
    private Category category;
    private LocalDate date;

    public Expense(String name, double amount, Category category, LocalDate date) {
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Назва: " + name +
                ", Сума: " + amount + " грн" +
                ", Категорія: " + category +
                ", Дата: " + date;
    }
}
