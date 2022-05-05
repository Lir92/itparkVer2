package lesson11;

public class Car implements Cloneable {

    private Engine engine;
    private double distance;
    private String mark;
    private  String model;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {//\
        Car clone = (Car) super.clone();                      //\ данный метод помогает делать глубокое клонирование,
        clone.setEngine(this.engine.clone());                 /// где получаемые объекты будут являться разными объектами
        return clone;                                        ///
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", distance=" + distance +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public /*static*/ class Engine implements Cloneable {
        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }
        /*
            Если класс должен зависеть от класса, в который он вложен, то делаем не статический класс.
            Если необходимо сделать внутренний класс независимым от того, класса в котором он прописан, то делаем его
        static. Это его трансформирует во вложенный класс и даст возможность пользоваться его объектами везде, где необходимо,
        не обращаясь к основному классу.

        Выделять в static класс можно, если необходимо сделать класс, который будет независимо использоваться в других
        классах
        */

        @Override
        protected Engine clone() throws CloneNotSupportedException { //\ метод для глубокого клонирования
            return (Engine) super.clone();                           ///
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "volume=" + volume +
                    '}';
        }
    }
}
