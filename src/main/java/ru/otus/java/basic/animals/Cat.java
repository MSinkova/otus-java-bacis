package ru.otus.java.basic.animals;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwimming, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwimming = speedSwimming;
        this.endurance = endurance;
    }

    //Все животные на 1 метр бега тратят 1 ед выносливости,
    //Собаки на 1 метр плавания - 2 ед.
    //Лошади на 1 метр плавания тратят 4 единицы
    //Кот плавать не умеет.
    //в наследниках переопределить, которые должны возвращать время, затраченное на указанное действие, и “понижать выносливость” животного

    @Override
    public float swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return 0;
    }
}
