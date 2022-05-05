package lesson10.HWConverterVer2.impl;

import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureValue;

import static lesson10.HWConverterVer2.impl.FahrenheitToCelsiusConverter.COEFFICIENT;
import static lesson10.HWConverterVer2.impl.FahrenheitToCelsiusConverter.DELTA;

public class CelsiusToFahrenheitConverter implements Convertible {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * COEFFICIENT + DELTA;
    }
}
