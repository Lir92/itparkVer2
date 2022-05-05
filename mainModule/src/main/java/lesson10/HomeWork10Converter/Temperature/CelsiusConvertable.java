package lesson10.HomeWork10Converter.Temperature;

// здесь логика перевода температур в Цельсий
public interface CelsiusConvertable {

    default void convertKelvinToCelsius(double degreeKelvin) {
        System.out.println(degreeKelvin + " К = " + (degreeKelvin - 273.15) + " С.");
    }

    default void convertFahrenheitToCelsius(double degreeFahrenheit) {
        System.out.println(degreeFahrenheit + " F = " + ((degreeFahrenheit - 32) * 5/9) + " C.");
    }
}
