package lesson10.HomeWork10Converter;

import lesson10.HomeWork10Converter.Length.Length;
import lesson10.HomeWork10Converter.Temperature.Temperature;

import java.util.Scanner;

public class ConverterLauncher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Выберите что вы хотите конвертировать\s
                1 - Температура;\s
                2 - Длина: \s""");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.print(text + " не является числом. Введите число из указанных выше: ");
        }
        int measurement = scanner.nextInt();

        if (measurement <= 0 || measurement > 2) {
            System.out.println("Вам необходимо выбрать число из списка указанного выше.");
        }

        if (measurement == 1){
            Temperature temperature = new Temperature();
            temperature.countTemperature();
        } else if (measurement == 2){
            Length length = new Length();
            length.countLength();
        }
        scanner.close();
    }

}