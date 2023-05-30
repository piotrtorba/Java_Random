package YT_JNSP.ExpensesApp;

public class Expense {
    private String type;
    private int month;
    private double value;
    private String description;

    public Expense(String description, String type, int month, double value) {
        this.type = type;
        this.month = month;
        this.value = value;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getMonth() {
        return month;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
