package bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer {

    private String firstName;
    private String lastName;
    private Account acc;
    private String[] userIDs = {"foo", "bar", "endGame123", "GOT"};
    private String userId;
    private String password;
    private boolean isAccountCreated;

    //Constructor with initialized values
    public Customer() {
        firstName = "John";
        lastName = "Doe";
    }

    //
//	//Constructor with parameters
    public Customer(String userId, String password, String firstName, String lastName) {


        if (userId.length()<3) {
            System.out.println("Account Id length must be larger than 3");
        } else  {
            this.userId = userId;
        }

        //Validating userid
        boolean isContains = false;

        for (String user : userIDs) {
            if (user.equals(userId)) {
                isContains = true;
            }
        }

        if (!isContains) {
            this.userId = userId;
        }

        //Validating password
        if (password.length() > 8 && password.matches("^[a-zA-Z0-9]*$") && password.contains(this.userId)) {
            this.password = password;
        } else {
            System.out.println("WARNING: Invalid Password");
        }

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(double initialBalance) {
        acc = new Account();
        acc.setAccountId(Account.getNextId());
        acc.deposit(initialBalance);
        acc.displayAccountDetails();
        isAccountCreated = true;
        Account.setAccountIds(isAccountCreated, acc.getAccountId());
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name:: " + lastName);
        System.out.println("User Id: " + userId);
        System.out.println("Password: " + password);

        for (String id : Account.getAccountIds()) {
            System.out.println(id);
        }
    }

    public void withdrawAmount(double amount) {
        acc.withdraw(amount);
        System.out.println("Current Balance: " + acc.getBalance());
        System.out.println("===========================================================");
        System.out.println("===========================================================");
    }

    public void deleteAccount() {
        if (isAccountCreated) {
            for (String accountId : Account.getAccountIds()) {
                if (accountId != null && accountId.equals(acc.getAccountId())) {
                    //Remove account object from database
                    System.out.println("Removed Account with id: " + acc.getAccountId());
                }
            }
        } else {
            System.out.println("Invalid Account");
        }
    }
}







