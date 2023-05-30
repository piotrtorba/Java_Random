package YT_JNSP.ExpensesApp;

import java.util.Scanner;

public class ExpensesApp {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        while (true) {
            System.out.println("1. Show all expenses");
            System.out.println("2. Show expenses for given month");
            System.out.println("3. Add new expense");
            System.out.println("4. Close the app");
            System.out.println("Please choose the option: ");
            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1 -> expenseManager.displayAll();
                case 2 -> System.out.println("Expenses for given month");
                case 3 -> expenseManager.addExpense(scanner);
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }

    }
}
