package lesson10.HWConverterVer2.impl;

import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureValue;

public class CelsiusToKelvinConverter implements Convertible {

    public static final double DELTA = 273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() + DELTA;
    }
}
