import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    // Add expense to the list
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // View all expenses
    public void viewExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense.getDate() + " | " + expense.getDescription() + " | " +
                    expense.getCategory() + " | $" + expense.getAmount());
        }
    }

    // Categorize expenses
    public void categorizeExpenses(String category) {
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense.getDate() + " | " + expense.getDescription() + " | $" + expense.getAmount());
            }
        }
    }
}
