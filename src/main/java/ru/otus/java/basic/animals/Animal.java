package ru.otus.java.basic.animals;

public abstract class Animal {
    //++У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
    //Затраты выносливости:
    //Все животные на 1 метр бега тратят 1 ед выносливости,
    //Собаки на 1 метр плавания - 2 ед.
    //Лошади на 1 метр плавания тратят 4 единицы
    //Кот плавать не умеет.
    //Реализуйте методы run(int distance) и swim(int distance)- в наследниках переопределить, которые должны возвращать время, затраченное на указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем сообщения в консоль.
    //++Добавляем метод info(), который выводит в консоль состояние животного.
    protected String name;
    protected int speedRun;
    protected int speedSwimming;
    protected int endurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public int getSpeedSwimming() {
        return speedSwimming;
    }

    public void setSpeedSwimming(int speedSwimming) {
        this.speedSwimming = speedSwimming;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void info() {
        System.out.println(name + " : скорость бега - " + speedRun + " скорость плавания - " + speedSwimming + " выносливость - " + endurance);
    }

    public float run(int distance) {
        if(this.endurance < 0) {
            System.out.println("У животного закончилась выносливость" + name);
            return -1;
        }
        this.endurance -= distance;
        System.out.println("У животного : " + name + " изменилась выносливость на: " + this.endurance);
        return distance / this.speedRun;
    }

    public float swim(int distance) {
        return 0;
    }
}
