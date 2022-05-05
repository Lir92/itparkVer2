package lesson12.cornercase;

import lesson12.exception.UnnamedException;

import java.util.Random;

public class InitializingBlock {

    private final String name;

    static {

        if (true/*new Random().nextBoolean()*/)  {
            throw new UnnamedException("Неизвестный блок");
        }
    }

    public InitializingBlock() /*throws UnnamedException*/ {
        //throw new UnnamedException("Задайте имя объекту");
        this.name = "Unknown";
    }

    public InitializingBlock(String name) /*throws UnnamedException*/ {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
