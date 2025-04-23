package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

public abstract class BankAccount {

    protected int accountId;
    protected double balance;
    protected AccountStatus accountStatus;

    public BankAccount(double balance, AccountStatus accountStatus) {
        this.accountId = Customer.MIN + (int)(Math.random() * ((Customer.MAX - Customer.MIN) + 1)); // generated numbers are within 111111 - 999999 range
        this.balance = balance;
        this.accountStatus = accountStatus;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public double deposit(double amount) {
        System.out.println("DEBUG: Current balance: " + balance + " Deposit amount: " + amount);
        double newBalance = this.balance + amount;
        System.out.print(" New balance: " + newBalance);
        return newBalance;
    }

    public double withdraw(double amount) {
        System.out.println("DEBUG: Current balance: " + balance + " Withdraw amount: " + amount);
        double newBalance = this.balance - amount;
        System.out.print(" New balance: " + newBalance);
        return newBalance;
    }


    // eleganteste lösung mit Switchcase für Enums zusammengefasst
    public void setAccountStatus(String userInput) {
        AccountStatus newStatus = AccountStatus.accountStatusByUserInput(userInput);
        switch (newStatus) {
            case ACTIVE, FROZEN, CLOSED -> accountStatus = newStatus;  // newStatus ist equivalent zu Accountstatus.FROZEN/ACTIVE/CLOSED
            case INVALID_INPUT -> System.out.println("Error: AccountStatus cannot be an invalid input");
        }

    /*
    Besser als vorher mit Switch Case

    public void setAccountStatus(String userInput) {
        AccountStatus newUserInput = AccountStatus.accountStatusByUserInput(userInput);
        switch (newUserInput) {
            case ACTIVE -> accountStatus = newUserInput;
            case FROZEN -> accountStatus = AccountStatus.FROZEN;
            case CLOSED -> accountStatus = AccountStatus.CLOSED;
            case INVALID_INPUT -> System.out.println("Error: AccountStatus cannot be an invalid input");
        }
       */

        /*
        Basic lösung

        if(newUserInput !=AccountStatus.INVALID_INPUT) {
            setAccountStatus(newUserInput);
        } else {
            System.out.println("Error: Accountstatus cannot be an invalid input");
        }
        */
    }

}
