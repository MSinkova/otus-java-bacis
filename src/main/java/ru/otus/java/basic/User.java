package ru.otus.java.basic;

public class User {
    private String lastName, firstName, patronymic;
    private int yearBirth;
    private String email;

    public int getYearBirth() {
        return yearBirth;
    }

    public User(String lastName, String firstName, String patronymic, int yearBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.yearBirth = yearBirth;
        this.email = email;
    }

    public void print() {
        System.out.println("___________________________________________________________________");
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic);
        System.out.println("Год рождения: " + yearBirth);
        System.out.println("e-mail: " + email);
        System.out.println("___________________________________________________________________");
    }
}
