package ru.otus.java.basic;

public class Application {
    //Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4. Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
    //Метод должен обойти все элементы массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа), должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException и AppArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
    public static void main(String[] args) {
        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[4][4];
        int[][] arr3 = new int[4][6];

        String[][] arr2d = {{"4","-1000","100", "1000"},{"5","-1000","100", "r"},{"5","-1000","100", "1000"},{"5","-1000","100", "1000"}};

        //validateArraysSize(arr1);
        //validateArraysSize(arr2);
        //validateArraysSize(arr3);
        validateArraysDate(arr2d);

    }

    public static void validateArraysSize(int[][] arr) {
        if(arr.length != 4) {
            throw new AppArraySizeException("Массив должен быть 4х4. В массиве строк = " + arr.length);
        }
        if(arr[0].length != 4) {
            throw new AppArraySizeException("Массив должен быть 4х4. В массиве столбцов = " + arr[0].length);
        }
    }


    public static int validateArraysDate(String[][] arr) {
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                try {
                    int number = Integer.parseInt(arr[i][j]);
                    totalSum += number;
                } catch (NumberFormatException e) {
                    System.out.println("В этой ячейке лежат неверные данные = " + arr[i][j] + ". Элемент: " + i + ", значение в элементе " + j);
                }
            }
        }
        return totalSum;
    }
}


