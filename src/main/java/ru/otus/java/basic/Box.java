package ru.otus.java.basic;

public class Box {
    /*
    Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно открывать и закрывать. Коробку можно перекрашивать.+
    Изменить размер коробки после создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль. +
    В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
    Выполнение методов должно сопровождаться выводом сообщений в консоль.
     */

    private int size;
    private String color;
    private boolean isOpened;
    private String item;


    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getItem() {
        return item;
    }
    public boolean getIsOpened() {
        return isOpened;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void info() {
        System.out.print("Размер коробки: " + size);
        System.out.print(", цвет: " + color);
        System.out.println("");
    }

    public boolean open() {
        if(!isOpened) {
            System.out.println("Коробка открыта");
        }
        return isOpened = true;
    }

    public boolean close() {
        if(isOpened) {
            System.out.println("Коробка закрыта");
        }
        return isOpened = false;
    }

    //Почему этот метод всегда возвращает null ?
    public String putItem (String item) {
        if(item == null) {
            this.item = item;
            System.out.println("Положили предмет: " + item);
            return item;
        } else {
            System.out.println("Коробка не пуста, там лежит предемет: " + item);
            return item;
        }
    }
}
