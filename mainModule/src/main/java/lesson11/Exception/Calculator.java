package lesson11.Exception;

import lesson11.Car;

public class Calculator {

    private Car car;

    public int division ( int m, int n) throws CloneNotSupportedException { // данная ошибка пробрасывается в метод devide
        car = (Car) new Car().clone();
        return m / n;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            return -100;
        } finally { // блок finally является всегда выполняющимся
            System.out.println("а = " + a + ", b = " + b);
            // return 123; // return не рекомендуется делать в finally блоке
        }
    }
}
