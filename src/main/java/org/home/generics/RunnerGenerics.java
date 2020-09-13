package org.home.generics;

import org.home.generics.entities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerGenerics {
    /*
    * Generics: Создать 4 класса, связанных иерархией на ваш выбор,
    * и сделать один абстрактный класс с абстрактными, обычными и
    * статическими методами. Функционал придумать на ваш выбор, пофантазируйте
    */

    public static void main(String[] args) {
        List<Facility> facilities = new ArrayList<>
                (Arrays.asList(new FoodFacility("KFC", 4.8f, FoodFacility.Type.fastFood),
                new EducationalFacility("Central National Library", 4.2f, EducationalFacility.Type.library),
                new FoodFacility("MacDonald's", 4.4f, FoodFacility.Type.fastFood),
                new EntertainmentFacility("Kinopark", 4.6f, EntertainmentFacility.Type.cinema),
                new EducationalFacility("#102 school of dance", 3.9f, EducationalFacility.Type.school)));

        Building<Facility> variousFacilitiesBuilding = new Building<>("Abay 102");
        variousFacilitiesBuilding.addAllFacilities(facilities);
        System.out.println(variousFacilitiesBuilding);

        List<FoodFacility> foodFacilities = new ArrayList<>(
                Arrays.asList(
                        new FoodFacility("Fortune", 4.7f, FoodFacility.Type.restaurant),
                        new FoodFacility("Kebab place", 4.9f, FoodFacility.Type.fastFood),
                        new FoodFacility("Starbucks", 4.8f, FoodFacility.Type.cafe)
                )
        );
        Building<FoodFacility> foodFacilityBuilding = new Building<>("Zharokova 240/2");
        foodFacilityBuilding.addAllFacilities(foodFacilities);
        System.out.println(foodFacilityBuilding);

    }
}
