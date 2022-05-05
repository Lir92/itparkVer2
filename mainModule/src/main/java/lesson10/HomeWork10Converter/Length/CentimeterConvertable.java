package lesson10.HomeWork10Converter.Length;

public interface CentimeterConvertable {

    // Конвертация сантиметров
    default void centimeterToMillimeter(double value){
        System.out.println(value + " cm = " + (value * 10) + " mm.");
    }

    default void centimeterToDecimeter(double value){
        System.out.println(value + " cm = " + (value / 10) + " dm.");
    }

    default void centimeterToMeter(double value){
        System.out.println(value + " cm = " + (value / 100) + " m.");
    }
}
