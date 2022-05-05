package lesson10.HWConverterVer2;

import lesson10.HWConverterVer2.impl.*;

public interface Convertible {

    double convert(TemperatureValue value); // это базовый метод, который переопределяется в классах с расчётами

    static double convert(TemperatureValue value, TemperatureMeasurementSystem toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelsiusConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToCelsiusConverter().convert(value);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementSystem()) {
                    case KELVIN -> {
                        return new IdentityConverter().convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsiusToKelvinConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvinConverter().convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new CelsiusToFahrenheitConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheitConverter().convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("В данный код мы не должны попасть");
    }

    // реализация в запускающем классе
    static double convert(double value, TemperatureMeasurementSystem fromSystem, TemperatureMeasurementSystem toSystem) {
        return Convertible.convert(new TemperatureValue(value, fromSystem), toSystem);

    }
}