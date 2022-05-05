package lesson12.HomeWork12Exceptions;

import lesson12.HomeWork12Exceptions.MyExceptions.MyArrayDataException;

import java.util.Random;

public class Arrays {

    public void fillArray(String[][] array) {
        String[] possibleValues = {"15", "35", "9", "K", "8", "70", "18", "6", "1", "2", "44", "8", "4", "20", "30", "500",
        "7", "468", "B", "696"};
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = possibleValues[random.nextInt(1, 10)];
            }
        }

    }

    public void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(java.util.Arrays.toString(array[i]));
        }
    }

    public void convertAndCount(String[][] array) {
        int [][] intMatrix = new int[4][4]; // здесь мы определяем новый массив int, куда передаём значения массива со значением String
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                intMatrix[x][y] = Integer.parseInt(array[x][y]);
            }
        }

        int result = 0;  // блок ниже ищет сумму значений многомерного массива
        for (int x1 = 0; x1 < intMatrix.length; x1++) {
            for (int y1 = 0; y1 < intMatrix[x1].length; y1++) {
                result = result + intMatrix[x1][y1];
            }
        }
        System.out.println(result);
    }
}


