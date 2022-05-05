package lesson12.HomeWork12Exceptions;

import lesson12.HomeWork12Exceptions.MyExceptions.MyArrayDataException;
import lesson12.HomeWork12Exceptions.MyExceptions.MyArraySizeException;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();

        Random randomMatrixSize = new Random();
        int i = randomMatrixSize.nextInt(3, 5);

        String [][] strMatrix = new String[i][i];
        if (i != 4) {
            throw new MyArraySizeException("Неверный размер двумерного массива. Введён массив размером " + i + " х " + i);
        }

        arrays.fillArray(strMatrix);

        try {
            arrays.convertAndCount(strMatrix);
        } catch (NumberFormatException nfe) {
            //nfe.printStackTrace();
            throw new MyArrayDataException("В массиве имеются нечисловые значения");
        }

        arrays.printArray(strMatrix);
    }
}