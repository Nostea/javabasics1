package de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2;

import de.home.playgrounds.javabasics.exercise3_collections.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    private final static String CLASS_NAME_FOR_MY_PARENT_CLASS = "de.home.playgrounds.javabasics.lecture12_casting_and_inheritance_features_2.MyParentClass";

    public static void main(String[] args) {
        ArrayList<MyParentClass> items = new ArrayList<>();
        MyParentClass item1 = new MyParentClass(1);
        MyChildClassOne item2 = new MyChildClassOne(2);
        MyChildClassTwo item3 = new MyChildClassTwo(3);
        MyChildClassTwo item4 = new MyChildClassTwo(4);
        MyParentClass item5 = new MyParentClass(5);
        MyChildClassTwo item6 = new MyChildClassTwo(6);
        MyChildClassOne item7 = new MyChildClassOne(7);
        MyParentClass item8 = new MyParentClass(8);

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);

        doStuffWithMyParentClassList(items);

        System.out.println("-----------");

        System.out.println("Naive Ausgabe von Klassennamen von Instanzen");
        System.out.println(item1.getClass().getName());
        System.out.println(item2.getClass().getName());
        System.out.println(item3.getClass().getName());


        // Initialisieren von Child-Klassen kann man mit dem Namen / Typen der Parentclass
        MyParentClass notAParent = new MyChildClassOne(1);         // Anders herum geht das nicht
        ArrayList<String> aStringList = new ArrayList<>();
        LinkedList<String> aLinkedStringList = new LinkedList<>();

        doStuffWithAList(aStringList);
        doStuffWithAList(aLinkedStringList);
        doStuffWithAConcreteList(aStringList);

        System.out.println("-------------------------");
        System.out.println();
        ArrayList<String> stringList = new ArrayList<>(); // Cool, eine explizite Liste von Strings
        ArrayList<Integer> integerList = new ArrayList<>(); // Cool, eine explizite Liste von Integers
        ArrayList<Object> objectList = new ArrayList<>(); // Ohoh, eine Liste von Objekten
        objectList.add(1);
        objectList.add("Hallo Welt");
        objectList.add(item4);
        objectList.add(true);
        objectList.add(new Person("A", "b", 'a', 10, null));

        for (Object o : objectList) {
            if (o instanceof MyChildClassTwo) {
                MyChildClassTwo castedObject = (MyChildClassTwo) o;
                System.out.println(castedObject.getMyStringAttribute());
            } else if (o instanceof Integer) {
                Integer castedObject = (Integer) o;
                System.out.println(castedObject.intValue());
            } else if (o instanceof String) {
                String castedObject = (String) o;
                System.out.println(castedObject.toUpperCase());
            } else if (o instanceof Boolean) {
                Boolean castedObject = (Boolean) o;
                System.out.println(castedObject.booleanValue());
            } else {
                System.out.println("Type not yet supported: " + o.getClass().getName() + ". Please remove item or ignore it or talk to the developer");
            }
        }

        System.out.println("++++++++++++++++++++");

        MyChildClassTwo awesomeChildClassTwoInstance = new MyChildClassTwo(2);
        awesomeChildClassTwoInstance.setMyStringAttribute("Foobar");

        System.out.println(awesomeChildClassTwoInstance);
        System.out.println(String.valueOf(awesomeChildClassTwoInstance));
        System.out.println(awesomeChildClassTwoInstance.toString());

        MyEntity myEntity = new MyEntity(42);
        MyChildClassThree childClassThree = new MyChildClassThree(1, "FOOBAR", myEntity);
        System.out.println(childClassThree);
    }

    public static void doStuffWithMyParentClassList(ArrayList<MyParentClass> myParentClassList) {
        for (MyParentClass item : myParentClassList) {
            if (item.getClass().getName().equals(CLASS_NAME_FOR_MY_PARENT_CLASS)) { // Naiver, schlechter Ansatz, um anhand des Klassennamens der
                System.out.println("I am a parent instance, my int value is: " + item.getMyIntAttribute() + ". Since I am a parent, I dont have any other attributes.");
            }
            if (item instanceof MyChildClassOne) { // Instanceof gibt einen boolean zurück, ob ein Objekt eine Instanz der angegebenen Klasse ist
                MyChildClassOne castedItem = (MyChildClassOne) item; // Class cast = Umwandeln in den vorher konkret geprüften Typen, um davon Attribute und Funktionen aufrufen zu können
                System.out.println("I am a child one instance, my int value is: " + castedItem.getMyIntAttribute() + ". My boolean value is: " + castedItem.isABooleanAttribute());
            }
            if (item instanceof MyChildClassTwo) {
                MyChildClassTwo castedItem = (MyChildClassTwo) item; // Class cast = Umwandeln in den vorher konkret geprüften Typen, um davon Attribute und Funktionen aufrufen zu können
                System.out.println("I am a child two instance, my int value is: " + castedItem.getMyIntAttribute() + ". My String value is: " + castedItem.getMyStringAttribute());
            }
        }
    }

    public static void doStuffWithAList(List<String> listParameter) {
        for (String s : listParameter) {
            System.out.println(s);
        }
    }

    public static void doStuffWithAConcreteList(ArrayList<String> listParameter) {
        for (String s : listParameter) {
            System.out.println(s);
        }
    }
}
