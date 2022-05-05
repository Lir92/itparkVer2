package lesson16.concurrency;

public class PrinterThread extends Thread {

    private final String value;
    private final int count;

    public PrinterThread(String val, int count) {
        this.value = val;
        this.count = count;
        setPriority(MAX_PRIORITY);
    }

    public PrinterThread(String val, int count, boolean daemon) {
        this.value = val;
        this.count = count;
        setPriority(MAX_PRIORITY);
        setDaemon(daemon);
    }

    public PrinterThread(String name, String val, int count) {
        super(name); //имя потока подставляется автоматически
        //setName(name); // этот метод подставляет явное имя, которое мы сами задаём
        this.value = val;
        this.count = count;
    }

    @Override
    public void run() { // данный метод не запускает отдельный поток, для запуска отдельного потока необходимо
        // использовать в методе main методом start().
        for (int i = 0; i < count; i++) {
            System.out.println(this.getName() + " : " + value); // здесь выводим имя потока и его значение.
        }
    }
}

