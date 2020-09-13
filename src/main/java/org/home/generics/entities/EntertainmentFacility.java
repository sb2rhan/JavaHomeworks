package org.home.generics.entities;

public class EntertainmentFacility extends Facility {
    public enum Type {
        club("Club"), karaoke("Karaoke center"), cinema("Cinema");
        public String description;

        Type(String description) {
            this.description = description;
        }
    }
    private Type type;

    public EntertainmentFacility(String name, float rating, Type type) {
        super(name, rating);
        this.type = type;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s: %s, rating: %.1f", this.getType().description, this.getName(), this.getRating());
    }
}
