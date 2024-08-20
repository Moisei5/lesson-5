package ru.moisei;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Person[] person = {
                new Person("Овечкин Александ Евграфтович", 45, "8(903)361-01-76", "хоккеист", 200000000, "Ovca@yahho.com"),
                new Person("Дышловой Илья Александрович", 40, "8(906)846-65-24", "Игрок", 300000, "duhlavoi@mail.ru"),
                new Person("Калякина Светлана Юрьевна", 58, "8(903)645-65-24", "Ип", 100000, "Kapa1203@mail.ru"),
                new Person("Самусенко Кирил Павлович", 30, "8(986)774-08-56", "Водитель", 20000, "samsa@mail.ru"),
                new Person("Краснов Виталий Алексеевич", 30, "8(987)871-45-70", "Менеджер", 70000, "Krasnov@mail.ru"),
        };
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() >= 40) {
                person[i].info();
            }
        }
    }
}
