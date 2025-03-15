package de.home.playgrounds.javabasics.exercise1;

public class PersonExercise {
    public static void main(String[] args) {
        Person peter = new Person(23,2002,"Peter", "Krause", "Waldweg", 12, "bowling", "male", 185,7500,80);
        Person laura = new Person(30,1995,"Laura", "Schmitz", "Kasseler Str", 3, "reading", "female", 170,8000,63);

        System.out.println("Person: " + laura.getFullName() + " lives at: " + laura.getAddress());
        System.out.println("Person: " + peter.getFullName() + " lives at: " + peter.getAddress());
        System.out.println();

        System.out.println(peter.firstName + " currently weighs " + peter.weight + " " + "kg");
        peter.walk(1000);
        System.out.println(laura.firstName + " currently weighs " + laura.weight + " " + "kg");
        laura.walk(500);
        System.out.println();

        System.out.println(peter.firstName + "`s favorite hobby is " + peter.favHobby + " and " +  laura.firstName + "`s is " + laura.favHobby);

        System.out.println(peter.firstName + " is currently " + peter.age + " years old");
        System.out.println(peter.firstName + " celebrates his birthday");
        peter.celebrateBirthday();
        System.out.println("He is " + peter.age + " years old now. Congrats!");

    }
}
