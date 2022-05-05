package lesson10.HomeWork10Converter.Length;

public interface MillimeterConvertable {

    // Конвертация миллиметров
    default void millimeterToCentimeter(double value){
        System.out.println(value + " mm = " + (value / 10) + " cm.");
    }

    default void millimeterToDecimeter(double value){
        System.out.println(value + "mm = " + (value / 100) + " dm.");
    }

    default void millimeterToMeter(double value){
        System.out.println(value + "mm = " + (value / 1000) + " m.");
    }
}
