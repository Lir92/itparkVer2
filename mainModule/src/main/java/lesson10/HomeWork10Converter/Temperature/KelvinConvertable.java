package lesson10.HomeWork10Converter.Temperature;

// здесь логика перевода температур в Кельвины
public interface KelvinConvertable {


    default void convertCelsiusToKelvin(double degreeCelsius) {
        System.out.println(degreeCelsius + " C = " + (degreeCelsius + 273.15) + " K.");
    }

    default void convertFahrenheitToKelvin(double degreeFahrenheit) {
        System.out.println(degreeFahrenheit + " F = " + ((degreeFahrenheit + 459.67) * 5/9) + " K.");
    }
}
