package lesson16.concurrency;

public class ThreadRunner {

    public static void main(String[] args) throws Exception {
        Thread.currentThread().setPriority(8);
        int a = 15;
        int b = 20;

        Thread printerThread1 = new PrinterThread("Первый поток printer", "Привет мир", 3);
//        Thread.State state = printerThread1.getState(); // данным способом можем посмотреть статус потока.
//        System.out.println("Текущий статус потока printerThread1 - " + state);
        Thread printerThread2 = new PrinterThread("Добро пожаловать!", 1, true);

        printerThread1.start(); // для запуска потоков следует использовать start(), а не run() класса Thread.
//        state = printerThread1.getState();
//        System.out.println("Текущий статус потока printerThread1 - " + state);
        //printerThread1.join(); // нужен будет в дз. Метод join притормаживает выполнение потока на определённое время для того, чтобы
        // дать время выполниться другому потоку.
        printerThread2.start();
        //printerThread2.join();

        new Thread(() -> print("Сумма значений а и b в потоке " + Thread.currentThread().getName() + " : " + sum(a,b))).start();
        // тоже, что и ниже, только с использованием лямбды.
        System.out.println("сейчас работает поток - " + Thread.currentThread().getName());

//        new Thread(new Runnable() { // ещё один метод создания нового потока
//            @Override
//            public void run() {
//                print(sum(a,b));
//            }
//        }).start();

//        Thread.sleep(60 * 1000);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static void print(Object ob) {
        System.out.println(ob);
    }
}
