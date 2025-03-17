package de.home.playgrounds.javabasics.lecture2;

public class Application {
    public static void main(String[] args) {
        MySystemOutPrintln.println(PersonWithPrivateAttributesAndFunctions.getPersonCounter());
        PersonWithPrivateAttributesAndFunctions person = new PersonWithPrivateAttributesAndFunctions("brown", 30, "Bob");
        MySystemOutPrintln.println(PersonWithPrivateAttributesAndFunctions.getPersonCounter());

        MySystemOutPrintln.println(PersonWithPrivateAttributesAndFunctions.getPersonCounter());
        PersonWithPrivateAttributesAndFunctions person2 = new PersonWithPrivateAttributesAndFunctions("black", 44, "Susie");
        MySystemOutPrintln.println(PersonWithPrivateAttributesAndFunctions.getPersonCounter());

        person.dyeHair("blonde");
        // System.out.println("The person %s has the hair color %s".formatted(person.getName(), person.getHairColor()));
        MySystemOutPrintln.println("The person %s has the hair color %s".formatted(person.getName(), person.getHairColor()));

        //System.out.println("--------------");
        MySystemOutPrintln.println("-------------");

        MyMathe math = new MyMathe();

        // System.out.println(math.getPi());
        MySystemOutPrintln.println(math.getPi());

        //System.out.println(math.add(3, 4));
        MySystemOutPrintln.println(math.add(3, 4));

        int sum = math.add(3, 4);
        int sum2 = math.add(1, 2);
        int sum3 = math.add(sum, sum2);
        int alternativeSum = math.add(math.add(1,2), math.add(3, 4));

        MyMathe math2 = new MyMathe();
        MyMathe math3 = new MyMathe();

        int sum4 = MyStaticMathe.add(1, 2);
        double pi = MyStaticMathe.PI;

        double piFromMath = Math.PI;

        MySystemOutPrintln.println(MySystemOutPrintln.getPrintlnCounter());
    }
}
