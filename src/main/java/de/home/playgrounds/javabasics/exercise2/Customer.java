package de.home.playgrounds.javabasics.exercise2;

public class Customer {

    public int age;
    public String name;
    public String gender;
    public int moneySpent;
    public String haircutStyle;
    public boolean isHairDamaged;
    public String hairColor;

    public static int timesVisited = 0;
    public static final int PRICE = 5; // in euro


    public Customer (int age, String name, String gender, int moneySpent, String haircutStyle, boolean isHairDamaged, String hairColor) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.moneySpent = moneySpent;
        this.haircutStyle = haircutStyle;
        this.isHairDamaged = isHairDamaged;
        this.hairColor = hairColor;
    }

    public void visitSalon() {
        Customer.timesVisited++;
        System.out.println(this.name + " arrived at salon.");

    }

    public void getHaircut(String haircutStyle) {
        System.out.println(this.name + " asked for the haircut style " + haircutStyle + " and had their hair cut");
        pay();
        TransactionLogger.makeLogEntry( this.name + " paid " + PRICE + ". Total spent: " + this.moneySpent);

    }

    public int getTimesVisited() {
        return timesVisited;
    }

    public void doHairdamage() {
        this.isHairDamaged = true;
        System.out.println("Oh no! " + this.name + "");
    }

    public void pay() {
        this.moneySpent = this.moneySpent + PRICE;
    }

}
