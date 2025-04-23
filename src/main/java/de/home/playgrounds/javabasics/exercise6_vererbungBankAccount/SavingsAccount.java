package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount( double balance, AccountStatus accountStatus, double interestRate) {
        super(balance,accountStatus);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
}
