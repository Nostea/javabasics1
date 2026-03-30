package de.home.playgrounds.javabasics.exercise23_Records;

public class CommentOnPocketContents {

    public static void main(String[] args) {
        Object object = new Candy(120);
        Object object2 = new Book("The Whale",200);
        switch (object2) {
            case Candy candy when candy.calories() > 10_000 -> System.out.println("Are you trying to sweeten the whole world?");
            case Candy candy -> System.out.println("Is this candy trying to start a dance party in my mouth?");
            case Book(var title, var pages) when pages > 100 -> System.out.println("Looks like someone was on a mission to make the dictionary jealous.");
            case Book(var title, var pages) when title.isEmpty() -> System.out.println("Diving into books that forgot to introduce themselves.");
            case Book book -> System.out.println("Opening minds, one page at a time");
            default -> System.out.println("Who knew boredom could be so three-dimensional?");
        }
    }

}
