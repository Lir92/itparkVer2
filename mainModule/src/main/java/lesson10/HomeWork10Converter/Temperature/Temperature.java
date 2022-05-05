package lesson10.HomeWork10Converter.Temperature;

import lesson10.HomeWork10Converter.ConverterSwitcher;

import java.util.Scanner;

public class Temperature {

    public void countTemperature(){

        ConverterSwitcher converter = new ConverterSwitcher();

        Scanner tempScanner = new Scanner(System.in);
        System.out.print("""
                Выберите что вы хотите конвертировать\s
                1 - Цельсий в Фаренгейт;\s
                2 - Цельсий в Кельвин;\s
                3 - Фаренгейт в Цельсий;\s
                4 - Фаренгейт в Кельвин;\s
                5 - Кельвин в Цельсий;\s
                6 - Кельвин в Фаренгейт :\s""");
        while (!tempScanner.hasNextInt()) {
            String text = tempScanner.next();
            System.out.print(text + " не является числом. Введите число из указанных выше: ");
        }
        int tempMeasurement = tempScanner.nextInt();

        if (tempMeasurement <= 0 || tempMeasurement > 6) {
            System.out.println("Вам необходимо выбрать число из списка указанного выше.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину для конвертации: ");
        while (!scanner.hasNextDouble()) {
            String text = scanner.next();
            System.out.print(text + " не является числом. Введите число: ");
        }
        double figure = scanner.nextInt();

        converter.convertTemperature(tempMeasurement, figure);
    }
}