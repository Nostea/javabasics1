package de.home.playgrounds.javabasics.lecture11_vererbung_exercise;

public abstract class Person {

    // Statt private benutzen wir den neuen Zugriffsmodifizierer protected, um die Attribute (als auch ggfls. Funktionen)
    // nach unten in der Vererbungshierarchie durchreichen zu können
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String emailAddress;
    protected Address address;

    public Person(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
        this.address.setPerson(this);
    }

    public void printBaseProfile() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Email address: " + this.emailAddress);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
