package org.home.generics.entities;

import java.util.ArrayList;
import java.util.List;

public class Building<F extends Facility> {
    private long id;
    private String address;
    private static long numberOfBuildings = 0;
    private final List<F> facilities = new ArrayList<>();

    public Building(String address) {
        this.id = ++numberOfBuildings;
        this.address = address;
    }

    public void addFacility(F newFacility) {
        this.facilities.add(newFacility);
    }
    public void addAllFacilities(List<F> facilities) {
        this.facilities.addAll(facilities);
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public static long getNumberOfBuildings() {
        return numberOfBuildings;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String
                .format("Building %d placed on %s\n", this.getId(), this.getAddress()));
        if (facilities.size() > 0) {
            s.append("  Facilities:\n");
            facilities.forEach(f -> {
                s.append("\t").append(f.toString()).append("\n");
            });
        }
        return s.toString();
    }
}
