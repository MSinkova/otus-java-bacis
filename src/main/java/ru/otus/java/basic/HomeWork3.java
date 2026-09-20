package ru.otus.java.basic;

public class HomeWork3 {

    public static void main(String[] args){
        int[][] arr2d = {{-1000,-1},{-9,-5},{-1,-2}};
        int size = 5;
        char[][] array = new char[size][size];
        //System.out.println(sumOfPositiveElements(arr2d));

        printSquare(size);
        // printArrayZeroDiagonal(array);
        //System.out.println(findMax(arr2d));
        //print2DArray(array);
        //System.out.println(sumSecondLine(arr2d));

    }

    //+ + Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    // ++ Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
    public static void printSquare(int size) {
        //char[][] array = new char[size][size];
        for(int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
               System.out.print(" * ");
               //array[0][j] = '*';
               //array[j][0] = '*';
               //array[i][array[i].length - 1] = '*';
               //array[array[j].length - 1][j] = '*';
               //array[i][size - 1] = '*';
               //array[size - 1][j] = '*';
           }
            System.out.println();
        }
    }


    //++ Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
    public static void printArrayZeroDiagonal(char[][] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]='*';
            }
        }
        for(int j = 0; j < array[0].length -1; j++) {
            array[j][j] = '\0';
        }
        array[array.length - 1][array[0].length - 1] = '\0';
        print2DArray(array);
    }

    //++Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    //Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует, то в качестве результата необходимо вернуть -1
    public static int sumSecondLine(int[][] array) {
       int sum = 0;
       if (array == null || array.length < 2) {
           return -1;
       }
       for (int j = 0; j < array[1].length; j++) {
            sum += array[1][j];
       }
       return sum;
    }



    // Распечатка массива
    public static void print2DArray(char[][] array) {
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
