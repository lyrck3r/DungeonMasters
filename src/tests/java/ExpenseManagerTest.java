import CostCall.Category;
import CostCall.ExpenseManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseManagerTest {

    private ExpenseManager manager;

    @BeforeEach
    void setUp() {
        manager = new ExpenseManager();
    }

    @Test
    void addExpense_shouldIncreaseTotal() {
        manager.addExpense("Food", 100.0, Category.FOOD);

        double total = manager.getTotal();

        assertEquals(100.0, total);
    }

    @Test
    void getTotal_shouldReturnSumOfAllExpenses() {
        manager.addExpense("Food", 100.0, Category.FOOD);
        manager.addExpense("Taxi", 50.0, Category.TRANSPORT);

        double total = manager.getTotal();

        assertEquals(150.0, total);
    }

    @Test
    void getTotalByCategory_shouldReturnOnlyCategorySum() {
        manager.addExpense("Food", 100.0, Category.FOOD);
        manager.addExpense("Burger", 50.0, Category.FOOD);
        manager.addExpense("Taxi", 70.0, Category.TRANSPORT);

        double foodTotal = manager.getTotalByCategory(Category.FOOD);

        assertEquals(150.0, foodTotal);
    }

    @Test
    void getTotalByCategory_whenNoExpenses_shouldReturnZero() {
        double total = manager.getTotalByCategory(Category.ENTERTAINMENT);

        assertEquals(0.0, total);
    }

    @Test
    void removeExpense_shouldDecreaseTotal() {
        manager.addExpense("Food", 100.0, Category.FOOD);
        manager.addExpense("Taxi", 50.0, Category.TRANSPORT);

        manager.removeExpense(1);

        assertEquals(50.0, manager.getTotal());
    }

    @Test
    void removeExpense_withWrongIndex_shouldNotChangeTotal() {
        manager.addExpense("Food", 100.0, Category.FOOD);

        manager.removeExpense(5);

        assertEquals(100.0, manager.getTotal());
    }
}