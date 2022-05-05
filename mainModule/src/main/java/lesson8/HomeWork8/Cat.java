package lesson8.HomeWork8;

public class Cat extends AnimalVoice{

    public Cat(String voice) {
        super(voice);
    }

    public void voice() {
        System.out.println("Cat makes \"meow\"");
    }
}
