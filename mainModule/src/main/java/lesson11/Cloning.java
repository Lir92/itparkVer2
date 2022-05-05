package lesson11;

public class Cloning implements Cloneable {

    /* клонирование при помощи конструктора */

    private String name;
    private long id;
    private double size;

    public Cloning(Cloning copy){ // таким конструктором можно заменить интерфейс маркер Cloneable
        this.id = copy.id;
        this.name = copy.name;
        this.size = copy.size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
