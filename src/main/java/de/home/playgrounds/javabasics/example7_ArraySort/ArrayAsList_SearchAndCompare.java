package de.home.playgrounds.javabasics.example7_ArraySort;

import java.util.Arrays;

public class ArrayAsList_SearchAndCompare {
    public static void main(String[] args) {
        // Index         0         1          2
        String[] a = {"Asus", "Elitegroup", "MSI"};
        String[] b = {"Elitegroup", "MSI", "Shuttle"};

        System.out.println(Arrays.asList(a).subList(1, 3).equals(Arrays.asList(b).subList(0, 2)));  // true
        /*
        Im Fall von subList(…) ist der Start-Index inklusiv und der End-Index exklusiv
        (das ist die Standardnotation von Bereichen in Java, etwa auch bei substring(…) oder fill(…)).
        Somit werden im obigen Beispiel die Einträge 1 bis 2 aus a mit den Einträgen 0 bis 1 aus b verglichen.
         */
    }
}
