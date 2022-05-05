package lesson10.HomeWork10Converter.Length;

public interface MeterConvertable {

    // Конвертация метров
    default void meterToMillimeter(double value){
        System.out.println(value + " m = " + (value * 1000) + " mm.");
    }

    default void meterToCentimeter(double value){
        System.out.println(value + " m = " + (value * 100) + " cm.");
    }

    default void meterToDecimeter(double value){
        System.out.println(value + " m = " + (value * 10) + " dm.");
    }
}
