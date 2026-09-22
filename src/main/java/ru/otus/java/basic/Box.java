package ru.otus.java.basic;

public class Box {
    /*
    Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет. Коробку можно открывать и закрывать. Коробку можно перекрашивать.+
    Изменить размер коробки после создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль. +
    В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
    Выполнение методов должно сопровождаться выводом сообщений в консоль.
     */

    final int size;
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
        return isOpened = true;
    }

    public boolean close() {
        return isOpened = false;
    }

    //Почему этот метод всегда возвращает null ?
    public String putItem (String newItem) {
        if(isOpened) {
           if(this.item == null) {
               this.item = newItem;
               System.out.println("Положили предмет: " + newItem);
               return newItem;
           } else {
               System.out.println("Коробка не пуста, там лежит предемет: " + newItem);
           }
        } else if(!isOpened) {
            System.out.println("Положить предмет можно только в открытую коробку");
        }
        return item;
    }

    public String discardItem() {
        if(isOpened) {
            if(item != null) {
                System.out.println("Из коробки выложели предмет: " + item);
                return item = null;
            } else {
                System.out.println("В коробке ничего нет");
            }
        } else if (!isOpened) {
            System.out.println("Выложить предмето можно только из откратой коробке");
        }
        return item;
    }
}