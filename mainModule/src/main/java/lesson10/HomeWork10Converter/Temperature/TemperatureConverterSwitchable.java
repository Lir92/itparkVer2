package lesson10.HomeWork10Converter.Temperature;

public interface TemperatureConverterSwitchable extends CelsiusConvertable, KelvinConvertable, FahrenheitConvertable {

    default void convertTemperature(int measurement, double figure){
        if (measurement == 1) {
            convertCelsiusToFahrenheit(figure);
        } else if (measurement == 2) {
            convertCelsiusToKelvin(figure);
        } else if (measurement == 3) {
            convertFahrenheitToCelsius(figure);
        } else if (measurement == 4) {
            convertFahrenheitToKelvin(figure);
        } else if (measurement == 5) {
            convertKelvinToCelsius(figure);
        } else if (measurement == 6) {
            convertFahrenheitToCelsius(figure);
        }
    }
}