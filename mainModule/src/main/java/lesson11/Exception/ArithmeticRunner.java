package lesson11.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticRunner {

    public static void main(String[] args) {
        System.out.println("Input two numbers to devide: ");
        Scanner scanner = new Scanner(System.in);
        int num1;
        try {
            System.out.println("Input first number: ");
            num1 = scanner.nextInt(); // если в блоке try ловится ошибка, то инициализируем устновленное значение, указанное
        } catch (Exception e) { // в блоке catch
            num1 = 11;
            scanner.next(); // этот метод продолжает программу, если попадается исключение
        }
        int num2;
        try {
            System.out.println("Input second number: ");
            num2 = scanner.nextInt(); // если в блоке try ловится ошибка, то инициализируем устновленное значение, указанное
            int result = devide(num1, num2);
            System.out.println("Результат деления: " + result);
//        } catch (ArithmeticException e) { // в блоке catch
//            System.out.println("Во время деления произошла ошибка");
//        } catch (InputMismatchException e) { // в блоке catch
//            System.out.println("Во время деления произошла ошибка");
        } catch (InputMismatchException | ArithmeticException e) { // данный способ даёт возможность объединять исключения и
            System.out.println("некорректный ввод пользователя");// обрабатывать их одинаковым образом
        } catch (Exception e) {
            System.out.println("Во время работы программы произошла ошибка");
        } finally { // блок finally является всегда выполняющимся

        }
        // проверка идёт от более узкого к более широкому типу (с верху в низ)

        System.out.println("Text after exception");
    }

    public static int devide( int a, int b) throws CloneNotSupportedException { // данная ошибка пробрасывается выше в
        // метод main
        //try {
            return new Calculator()./*division*/divide(a, b);
//        } catch (CloneNotSupportedException e) {
//            return -1;
//        }

    }
}