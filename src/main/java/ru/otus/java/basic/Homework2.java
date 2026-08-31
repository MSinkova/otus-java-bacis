package ru.otus.java.basic;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        int[] array = {25, 1, 9, 2, 20, 31};

        System.out.println("Введите число: ");
        int a = scannerInt.nextInt();

        System.out.println("Введите слово: ");
        String line = scannerString.nextLine();

        //funcPrintConcole(a, line);
        //arraySumArg(array);
        //fillArray(a, array);
        //fillArraySumNumber(a, array);
        arrayDifHalves(array);

    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в консоль строку указанное количество раз
    public static void funcPrintConcole(int a, String line) {
        for(int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void arraySumArg(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
    public static void fillArray(int value, int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = value;
            System.out.println(array[i]);
        }
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число
    public static void fillArraySumNumber(int value, int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
           sum = array[i] + value;
           System.out.println(sum);
       }
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в консоль сумма элементов какой из половин массива больше.
     public static void arrayDifHalves(int[] array) {
         int rightValue = 0;
         int leftValue = 0;
         for(int i = 0; i < array.length / 2; i++) {
             leftValue += array[i];
        }
         System.out.println("Левая часть = " + leftValue);
         for(int i = array.length / 2; i < array.length; i++) {
             rightValue += array[i];
         }
         System.out.println("Правая часть = " + rightValue);
         if(rightValue  > leftValue) {
             System.out.println("Правая часть больше " + rightValue);
         } else {
             System.out.println("Левая часть больше " + leftValue);
         }
     }
}
