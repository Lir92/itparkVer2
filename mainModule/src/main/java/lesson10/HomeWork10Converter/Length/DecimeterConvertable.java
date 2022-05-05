package lesson10.HomeWork10Converter.Length;

public interface DecimeterConvertable {

    // Конвертация дециметров
    default void decimeterToMillimeter(double value){
        System.out.println(value + " dm = " + (value * 100) + " mm.");
    }

    default void decimeterToCentimeter(double value){
        System.out.println(value + " dm = " + (value * 10) + " cm.");
    }

    default void decimeterToMeter(double value){
        System.out.println(value + " dm = " + (value / 10) + " m.");
    }
}
