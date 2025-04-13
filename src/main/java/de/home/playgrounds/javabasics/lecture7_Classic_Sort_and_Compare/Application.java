package de.home.playgrounds.javabasics.lecture7_Classic_Sort_and_Compare;

    import java.util.ArrayList;

    public class Application {
        public static void main(String[] args) {
            Address address1 = new Address("Unlustiger Damm", "190", "11000", "BÖRLIN");
            Address address2 = new Address("Funnystr", "20", "12033", "Berlin");
            Person p1 = new Person("Christopher", "Keksmonster", Person.GENDER_MALE, 33, address1);
            Person p2 = new Person("Anna", "Eclair", Person.GENDER_FEMALE, 30, address2);
            Person p3 = new Person("Bernd", "Rüdiger", Person.GENDER_MALE, 28, address1);
            Person p4 = new Person("Bernd", "Rüdiger", Person.GENDER_MALE, 32, address1);
            Person p5 = new Person("Bernd", "Gofman", Person.GENDER_MALE, 38, address1);
            Person p6 = new Person("Chris", "Schmuddellink", Person.GENDER_MALE, 3, address1);
            Person p7 = new Person("Jörg", "Stengel", Person.GENDER_MALE, 33, address1);

            ArrayList<Person> persons = new ArrayList<>();
            persons.add(p1);
            persons.add(p7);
            persons.add(p4);
            persons.add(p2);
            persons.add(p6);
            persons.add(p5);
            persons.add(p3);

            System.out.println("__Vor Sortierung__");
            for (Person person : persons) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }

            PersonFirstNameComparator firstNameComparator = new PersonFirstNameComparator();
            persons.sort(firstNameComparator);

            System.out.println("__Nach FirstName Sortierung__");
            for (Person person : persons) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }

            PersonAgeComparator ageComparator = new PersonAgeComparator();
            persons.sort(ageComparator);

            System.out.println("__Nach Age Sortierung__");
            for (Person person : persons) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }

            System.out.println();
            PersonFullComparator fullComparator = new PersonFullComparator();
            persons.sort(fullComparator);
            System.out.println();

            System.out.println("__Nach Full Sortierung__");
            for (Person person : persons) {
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }

