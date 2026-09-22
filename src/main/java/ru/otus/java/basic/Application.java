package ru.otus.java.basic;

public class Application {
    public static void main(String[] args) {
        User[] users = {
                new User("Андреева", "Дарья",  "Эмировна", 1976, "ade@mail.ru"), //50
                new User("Овчинникова", "Анастасия",  "Егоровна", 2000, "aryru@mail.ru"), //26
                new User("Дубинин", "Леонид",  "Егорович", 1983, "dgwrqg@mail.ru"), // 43
                new User("Олейников", "Богдан",  "Артёмович", 1972, "dgshs@mail.ru"), // 54
                new User("Новикова", "Варвара",  "Тимофеевна", 1992, "shshs@mail.ru"), //
                new User("Зорин", "Артемий",  "Степанович", 1933, "sfsgha@mail.ru"), //93
                new User("Грибов", "Кирилл",  "Андреевич", 1990, "shhsh@mail.ru"),
                new User("Рябова", "Полина",  "Ярославовна", 1991, "fsahaj@mail.ru"),
                new User("Антонова", "Мария",  "Эмировна", 1994, "otyh_yeg@mail.ru"),
                new User("Артемова", "Анна",  "Тимофеевна", 1995, "asqeq_rwe@mail.ru")
        };

        for(int i = 0; i < users.length; i++) {
            int age = 2026 - users[i].getYearBirth();
            if(age > 40 ) {
                users[i].print();
            }
        }

        //

        Box box1 = new Box(4, "Green");
        Box box2 = new Box(2, "Blue");
        box1.info();
        box2.info();
        box2.setColor("Red");

        box1.open();
        System.out.println(box1.getIsOpened());
        box2.close();
        box2.setColor("Red");
        box2.info();
        if (box1.getIsOpened() && box1.getItem() == null) {
            System.out.println(box1.getItem());
            box1.putItem("Шоколад");
        }
        box2.discardItem();
        box2.open();
        box2.discardItem();
        box1.discardItem();
    }
}
