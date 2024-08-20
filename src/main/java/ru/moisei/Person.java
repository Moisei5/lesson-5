package ru.moisei;

public class Person {
    private String surName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String surName, int age, String phoneNumber, String jobTitle, int salary, String email) {
        this.surName = surName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        if (age > 0) {
            this.age = age;
        }
    }

    public void info() {
        System.out.println(" ФИО " + surName + " Возраст " + age + " Специальность " + jobTitle + " Зарплата " + salary +
                " Эл.Почтовый адрес " + email + " телефона № " + phoneNumber);
    }
}
