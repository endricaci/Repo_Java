package bank;

public class Account {

    private double balance;
    private String accountId;
    private static int nextId = 0;
    public static final int ROUTING_NUMBER = 123456;
    private static String [] accountIds = new String[20];

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("WARNING:  Amount exceeds your account balance");
        } else {
            balance = balance - amount;
        }

    }

    public static void setAccountIds(boolean isAccountCreated, String accountId) {

        while (isAccountCreated) {
            accountIds[nextId -1 ] = accountId;
            isAccountCreated = false;
        }
    }

    public static String[] getAccountIds() {
        return accountIds;
    }

    public void displayAccountDetails() {
        System.out.println("*** Account Information ***");
        System.out.println(" ID: " + accountId);
        System.out.println("Initial Balance: " + balance);
        System.out.println("Routing Number: " + ROUTING_NUMBER);
        System.out.println("Account Id's Length: " + accountIds.length);
    }

    public void setAccountId(String accountId) {

        this.accountId = accountId;


    }

    public String getAccountId() {
        return accountId;
    }

    public static String getNextId() {
        return "ACCT# " + Account.nextId++;
    }

    public double getBalance() {
        return balance;
    }
}


