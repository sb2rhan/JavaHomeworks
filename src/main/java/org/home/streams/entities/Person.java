package org.home.streams.entities;

// Предварительно создайте класс Person с полями int id,
// String username, int age, enum Authority (SHEFF, WORKER, DRIVER)
public class Person {
    public enum Authority {
        SHEFF, WORKER, DRIVER
    }
    private int id;
    private String username;
    private int age;
    private Authority authority;

    public Person (int id, String username, int age, Authority authority) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", authority=" + authority +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}
