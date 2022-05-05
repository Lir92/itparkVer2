package lesson10.HomeWork10Converter.Length;

public interface LengthConverterSwithchable extends MillimeterConvertable, CentimeterConvertable, DecimeterConvertable,
MeterConvertable{

    default void convertLength(int measure, double figure){

        if (measure < 0){
            System.out.println("Невозможно сконвертировать отрицательное значение длины");
        }else if (measure == 1) {
            millimeterToCentimeter(figure);
        } else if (measure == 2) {
            millimeterToDecimeter(figure);
        } else if (measure == 3) {
            millimeterToMeter(figure);
        } else if (measure == 4) {
            centimeterToMillimeter(figure);
        } else if (measure == 5) {
            centimeterToDecimeter(figure);
        } else if (measure == 6) {
            centimeterToMeter(figure);
        } else if (measure == 7) {
            decimeterToMillimeter(figure);
        } else if (measure == 8) {
            decimeterToCentimeter(figure);
        } else if (measure == 9) {
            decimeterToMeter(figure);
        } else if (measure == 10) {
            meterToMillimeter(figure);
        } else if (measure == 11) {
            meterToCentimeter(figure);
        } else if (measure == 12) {
            meterToDecimeter(figure);
        }
    }
}