import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Categorize Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter date (MM/DD/YYYY): ");
                    String date = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter amount: $");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Expense expense = new Expense(date, description, category, amount);
                    manager.addExpense(expense);
                    System.out.println("Expense added successfully!");
                    break;
                case 2:
                    System.out.println("\nAll Expenses:");
                    manager.viewExpenses();
                    break;
                case 3:
                    System.out.print("Enter category to filter: ");
                    String filterCategory = scanner.nextLine();
                    System.out.println("\nExpenses in Category: " + filterCategory);
                    manager.categorizeExpenses(filterCategory);
                    break;
                case 4:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
