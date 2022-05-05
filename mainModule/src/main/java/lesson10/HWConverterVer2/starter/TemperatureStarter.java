package lesson10.HWConverterVer2.starter;

import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureMeasurementSystem;

import java.util.Scanner;

public class TemperatureStarter {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в конвертер. Тут ты сможеь конвертировать температуры.");
        System.out.println("Введи пожалуйста значение для конвертации: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            String inputValue = scanner.next();
            System.out.printf("Вместо %s ожидали значени температуры, как вещественного числа \n", inputValue);
        }
        double value = scanner.nextDouble();
        System.out.println("Введи пожалуйста исходную систему измерений - C, K, F: ");
        String temperatureSystem = scanner.next();
        System.out.println("Введи пожалуйста систему измерений в которую будем конвертировать - C, K, F: ");
        String destinationTemperatureSystem = scanner.next();
        System.out.printf("Результат: %.2f", Convertible.convert(value, // %.nf - определяет округление результата до n-го знака после запятой
                TemperatureMeasurementSystem.of(temperatureSystem),
                TemperatureMeasurementSystem.of(destinationTemperatureSystem)));
    }
}
