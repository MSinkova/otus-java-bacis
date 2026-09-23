package ru.otus.java.basic.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwimming, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwimming = speedSwimming;
        this.endurance = endurance;
    }

    @Override
    public float swim(int distance) {
        if(this.endurance < 0) {
            System.out.println("У животного закончилась выносливость" + name);
            return -1;
        }
        this.endurance -= 4;
        System.out.println("У животного : " + name + " изменилась выносливость на: " + this.endurance);
        return distance / this.speedRun;
    }
}
