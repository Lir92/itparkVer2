package lesson10.HWConverterVer2.impl;

import lesson10.HWConverterVer2.Convertible;
import lesson10.HWConverterVer2.TemperatureValue;

// Данный класс необходим для того, что, если выберут 2 одинаковые системы измерения, результатом будет вывод на экран
// вводимого значения.
public class IdentityConverter implements Convertible {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue();
    }
}
