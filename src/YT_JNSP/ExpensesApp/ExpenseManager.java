package YT_JNSP.ExpensesApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {
    List<Expense> expenses = new ArrayList<>();
    public void displayAll() {
        expenses.forEach(expense -> {
            System.out.println(expense.getDescription());
            System.out.println(expense.getType());
            System.out.println(expense.getMonth());
            System.out.println(expense.getValue());
        });
    }

    public void addExpense(Scanner scanner){
        System.out.println("What is your new expense?");
        String description = scanner.nextLine();
        System.out.println("What type of expense is it?");
        String type = scanner.nextLine();
        System.out.println("What is the month of the expense?");
        int month = scanner.nextInt();
        scanner.nextLine(); //Clear scanner buffer otherwise I receive NumberFormatException in line 26 ExpenseManager
        System.out.println("What is the value?");
        double value = Double.parseDouble(scanner.nextLine());

        Expense expense = new Expense(description, type, month, value);
        expenses.add(expense);
    }
}
