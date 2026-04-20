package de.home.playgrounds.javabasics.exercise23_Records;

public record Location(double latitude, double longitude) {
    // -- Variant 1 -----------------------------------------
    public Location {
        if (!isValid(latitude, longitude)) throw new IllegalArgumentException("Invalid range");
    }

    /* -- Variant 2 -----------------------------------------
    public Location(double latitude, double longitude) {
        if (!isValid(latitude, longitude)) throw new IllegalArgumentException("Invalid range");
        this.latitude = latitude;
        this.longitude = longitude;
    }
    */


    private static boolean isValid(double latitude, double longitude) {
        return (-90 <= latitude && latitude <= +90) && (-180 <= longitude && longitude <= +180);
    }
}


