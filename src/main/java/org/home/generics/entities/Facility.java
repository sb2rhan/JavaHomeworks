package org.home.generics.entities;

public abstract class Facility {
    private long id;
    private String name;
    private float rating;
    private static long numberOfFacilities = 0;

    public Facility(String name, float rating) {
        this.id = ++numberOfFacilities;
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public static long getNumberOfFacilities() {
        return numberOfFacilities;
    }

    @Override
    public abstract String toString();
}
