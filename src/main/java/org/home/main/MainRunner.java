package org.home.main;

import org.home.entities.Person;

import java.util.*;
import java.util.stream.Collectors;

public class MainRunner {
    public static void initPeopleList(List<Person> people) {
        people.add(new Person(1, "Conor", 19, Person.Authority.WORKER));
        people.add(new Person(2, "Gleb", 22, Person.Authority.DRIVER));
        people.add(new Person(3, "Derick", 20, Person.Authority.WORKER));
        people.add(new Person(4, "Scott", 18, Person.Authority.WORKER));
        people.add(new Person(5, "Patrick", 30, Person.Authority.SHEFF));
        people.add(new Person(6, "Clark", 24, Person.Authority.DRIVER));
        people.add(new Person(7, "Freddie", 24, Person.Authority.WORKER));
        people.add(new Person(8, "John", 27, Person.Authority.DRIVER));
        people.add(new Person(9, "Derick", 21, Person.Authority.DRIVER));
        people.add(new Person(10, "Bary", 24, Person.Authority.WORKER));
        people.add(new Person(11, "Clark", 20, Person.Authority.WORKER));
        people.add(new Person(12, "Brad", 17, Person.Authority.DRIVER));
        people.add(new Person(13, "Kepler", 25, Person.Authority.DRIVER));
        people.add(new Person(14, "Susan", 30, Person.Authority.DRIVER));
        people.add(new Person(15, "Joseph", 26, Person.Authority.WORKER));
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        // 1 task
        initPeopleList(people);

        // 2 task
            // 1
        System.out.println("\tSorted people by age:");
        people.sort(Comparator.comparing(Person::getAge));
        people.forEach(System.out::println);

            // 2
        System.out.println("\tSheff:");
        people.stream()
                .filter(prs -> prs.getAuthority() == Person.Authority.SHEFF)
                .forEach(System.out::println);

            // 3
        System.out.println("\tUsers with identical names:");
        List<String> peopleNames = people.stream().map(Person::getUsername)
                .collect(Collectors.toList());
        people.stream()
                .filter(prs -> Collections.frequency(peopleNames, prs.getUsername()) > 1)
                .forEach(System.out::println);

            // 4
        System.out.println("\tWorkers:");
        people.stream()
                .filter(prs -> prs.getAuthority() == Person.Authority.WORKER)
                .forEach(System.out::println);

            // 5
        System.out.println("\tDrivers:");
        people.stream()
                .filter(prs -> prs.getAuthority() == Person.Authority.DRIVER)
                .forEach(System.out::println);

            // 6
        System.out.println("\tA person with min age:");
        people.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .ifPresent(System.out::println);

            // 7
        System.out.println("\tA person with max age:");
        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(System.out::println);

            // 8
        System.out.println("\tA collection of usernames:");
        List<String> usernames = people.stream()
                .map(Person::getUsername)
                .collect(Collectors.toList());
        usernames.forEach(prs -> System.out.print(prs + ", "));
    }
}
