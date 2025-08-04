package de.home.playgrounds.javabasics.exercise14_MultiplicationHTMLtable;

public class MultiplicationTable {

    public static void writeTable (int quantity){
        int flamethrower = 500;
        int fireextinguisher = 100;

        for (int i = 1; i <= quantity; i++) {
            System.out.println("<tr><td>" + i + "</td><td>" + (flamethrower * i) + "</td>" + "<td>" + (fireextinguisher * i) + "</td></tr>");
        }
    }

    public static void main(String[] args) {

        System.out.println("<html>");
        System.out.println("<table>");
        System.out.println("<tr><th>Quantity</th><th>Flamethrower</th><th>Fire extinguisher</th></tr>");
        writeTable(10);
        System.out.println("</table>");
        System.out.println("</html>");
    }
}
