package de.home.playgrounds.javabasics.exercise6_vererbungBankAccount;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private Address customerAddress;
    private ArrayList<BankAccount> associatedBankAccounts;

    public static final int MIN = 111111;
    public static final int MAX = 999999;


    public Customer(String firstName, String lastName, String email, String mobileNumber, Address customerAddress) {
        this.customerId = MIN + (int)(Math.random() * ((MAX - MIN) + 1)); // generated numbers are within 111111 - 999999 range
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.customerAddress = customerAddress;
        this.associatedBankAccounts = new ArrayList<>();
    }

    public void printCustomerInfo() {
        ArrayList<String> customerInfoList = new ArrayList<>();
        customerInfoList.add(String.valueOf(customerId));
        customerInfoList.add(firstName);
        customerInfoList.add(lastName);
        customerInfoList.add(email);
        customerInfoList.add(mobileNumber);
        customerInfoList.add(String.valueOf(customerAddress));

        for( String infoLine : customerInfoList) {
            System.out.println(infoLine);
        }
    }

    // TODO
     public void openNewSavingAccount(BankAccount newAccountName) {
        System.out.println("Opening new SavingsAccount for customer " + firstName + " " + lastName);
        newAccountName = new SavingsAccount(1000.2,AccountStatus.ACTIVE,0.02);
        associatedBankAccounts.add(newAccountName);
     }

     //TODO
     public void openNewCheckingAccount(BankAccount newCheckingAccountName) {
        System.out.println("Opening new CheckingAccount for customer " + firstName + " " + lastName);
        newCheckingAccountName = new CheckingAccount(2050.15,AccountStatus.ACTIVE,0.10);
        associatedBankAccounts.add(newCheckingAccountName);
     }

     public void listAllBankAccounts() {
        System.out.println("Listing all BankAccounts associated with " + firstName + " " + lastName);
        for ( BankAccount bankAccount : this.associatedBankAccounts) {
            System.out.println("AccountId: " + bankAccount.getAccountId() + " Status: " + bankAccount.getAccountStatus() + " Balance: " + bankAccount.getBalance());
        }

     }


}
