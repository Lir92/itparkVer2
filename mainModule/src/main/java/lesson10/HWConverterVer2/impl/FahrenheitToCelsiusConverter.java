package lesson10.HWConverterVer2.impl;

import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureValue;

public class FahrenheitToCelsiusConverter implements Convertible {

    public static final int DELTA = 32;

    public static final double COEFFICIENT = 1.8; // = 9/5

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - DELTA) / COEFFICIENT;
    }
}
