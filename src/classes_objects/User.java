package classes_objects;

public class User {


    private String name;
    private int age;
    private double income;
    private double expense;

    public void getAccountSummary () {
        String summary = " Name: " + name + " Age " + age + " Income: " + income + " Expense: " + expense;
        System.out.println(summary);
    }

    public double getAccountBalance() {
        return income - expense;
    }

    public void setUserDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setIncome(double income) {
        this.income = this.income + income;
    }

    public void setExpense(double expense) {
        this.expense = this.expense + expense;
    }

    public void resetBalance() {
        income = 0;
        expense = 0;
    }
}
