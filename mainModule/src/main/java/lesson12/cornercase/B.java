package lesson12.cornercase;

import lesson12.exception.MethodException;
import lesson12.exception.ParticularMethodException;
import lesson12.exception.UnnamedException;

public class B extends A {

    @Override
    protected void a() /*throws MethodException*/ { // в данном случае при переопределении метода от родителя, если мы
//        try { // не наследуем выброс исключения, мы должны его обработать в try-catch блоке.
//            super.a();
//        } catch (MethodException e) {
//            e.printStackTrace();
//        }
    }

    void b() {

    }
}
