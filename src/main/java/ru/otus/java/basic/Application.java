package ru.otus.java.basic;

import ru.otus.java.basic.animals.Animal;
import ru.otus.java.basic.animals.Cat;
import ru.otus.java.basic.animals.Dog;
import ru.otus.java.basic.animals.Horse;

public class Application {

    public static void main(String[] args) {

        Animal[] animals = {
            new Cat("Barsik", 10, 0, 10),
            new Dog("Wuppy", 5, 10, 20),
            new Horse("Leon", 20,5, 45)
        };
        for(int i = 0; i < animals.length; i++) {
            animals[i].info();
            System.out.println(animals[i].run(5));
            animals[i].swim(10);
            animals[i].info();
        }

    }

}
