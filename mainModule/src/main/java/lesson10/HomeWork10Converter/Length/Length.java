package lesson10.HomeWork10Converter.Length;

import lesson10.HomeWork10Converter.ConverterSwitcher;

import java.util.Scanner;

public class Length {

    public void countLength() {

        ConverterSwitcher converter = new ConverterSwitcher();

        Scanner lengthScanner = new Scanner(System.in);
        System.out.print("""
                Выберите что вы хотите конвертировать\s
                1 - Миллиметры в сантиметры;\s
                2 - Миллиметры в дециметры;\s
                3 - Миллиметры в метры;\s
                4 - Сантиметры в миллиметры;\s
                5 - Сантиметры в дециметры;\s
                6 - Сантиметры в метры;\s
                7 - Дециметры в миллиметры;\s
                8 - Дециметры в сантиметры;\s
                9 - Дециметры в метры;\s
                10 - Метры в миллиметры;\s
                11 - Метры в сантиметры;\s
                12 - Метры в дециметры :\s""");
        while (!lengthScanner.hasNextInt()) {
            String text = lengthScanner.next();
            System.out.print(text + " не является числом. Введите число из указанных выше: ");
        }
        int lengthMeasurement = lengthScanner.nextInt();

        if (lengthMeasurement <= 0 || lengthMeasurement > 12) {
            System.out.println("Вам необходимо выбрать число из списка указанного выше.");
        }

        Scanner figureScanner = new Scanner(System.in);
        System.out.println("Введите величину для конвертации: ");
        while (!figureScanner.hasNextDouble()) {
            String text = figureScanner.next();
            System.out.print(text + " не является числом. Введите число: ");
        }
        double figure = figureScanner.nextInt();

        converter.convertLength(lengthMeasurement, figure);
    }
}