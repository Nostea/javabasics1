package de.home.playgrounds.javabasics.exercise23_Records;

public class LocationDemo {


    public static void main(String[] args) {

        Location manila = new Location(14.60416, 120.98222);
        System.out.printf("latitude=%f, longitude=%f%n", manila.latitude(), manila.longitude());
        System.out.println(manila);

        System.out.println();

        Location location1 = new Location( 14.60416, 120.98222 );
        System.out.println( location1.equals( manila ) );

        Location location2 = new Location( 14, 120 );
        System.out.println( location2.equals( manila ) );

    }


}
