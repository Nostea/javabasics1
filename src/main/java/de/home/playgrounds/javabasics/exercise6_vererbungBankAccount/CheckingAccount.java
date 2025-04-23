package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

public class CheckingAccount extends BankAccount{

    private double transactionFee;

    public CheckingAccount(double balance, AccountStatus accountStatus, double transactionFee) {
        super(balance,accountStatus);
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
}
