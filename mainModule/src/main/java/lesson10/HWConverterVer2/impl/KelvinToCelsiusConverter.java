package lesson10.HWConverterVer2.impl;

import static lesson10.HWConverterVer2.impl.CelsiusToKelvinConverter.DELTA;
import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureValue;

public class KelvinToCelsiusConverter implements Convertible {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() - DELTA;
    }
}
