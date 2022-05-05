package lesson10.HomeWork10Converter.Temperature;

// здесь логика перевода температур в Фаренгейт
public interface FahrenheitConvertable {

    default void convertCelsiusToFahrenheit(double degreeCelsius) {
        System.out.println(degreeCelsius + " C = " + (degreeCelsius * 9/5 + 32) + " F.");
    }

    default void convertKelvinToFahrenheit(double degreeKelvin) {
        System.out.println(degreeKelvin + " K = " + (degreeKelvin * 9/5 - 459.67) + " F.");
    }
}
