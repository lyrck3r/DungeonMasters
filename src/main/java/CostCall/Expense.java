package CostCall;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Expense {
    private String name;
    private double amount;
    private Category category;
    private LocalDateTime dateTime;

    public Expense(String name, double amount, Category category, LocalDateTime dateTime) {
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.dateTime = dateTime;
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        return "Назва: " + name +
                ", Сума: " + amount + " грн" +
                ", Категорія: " + category +
                ", Дата і час: " + dateTime.format(formatter);
    }
}
