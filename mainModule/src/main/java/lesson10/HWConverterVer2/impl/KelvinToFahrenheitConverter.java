package lesson10.HWConverterVer2.impl;

import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertible {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue() - CelsiusToKelvinConverter.DELTA) * FahrenheitToCelsiusConverter.COEFFICIENT
                + FahrenheitToCelsiusConverter.DELTA;
    }
}
