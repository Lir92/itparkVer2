package lesson10.HWConverterVer2;

import java.util.Objects;

public enum TemperatureMeasurementSystem {
    CELSIUS("C"), KELVIN("K"), FAHRENHEIT("F");

    private final String shortName;

    TemperatureMeasurementSystem(String shortName) {
        this.shortName = shortName;
    }

    public static TemperatureMeasurementSystem of(String input) {
        for (TemperatureMeasurementSystem measurementSystem: values()) {
            //if (Objects.equals(measurementSystem.shortName, input))
            if (measurementSystem.shortName.equalsIgnoreCase(input)) { // проверяем то ли значение ввёл пользователь
                return measurementSystem; // если введено верное значение, то выводим
            }
        }
        return CELSIUS; // если введено неверное значение, выводим базовое значение, в этом случае Цельсиус.
    }
}
