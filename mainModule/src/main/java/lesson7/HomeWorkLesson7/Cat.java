package lesson7.HomeWorkLesson7;

public class Cat {
    String animalType;
    String name;
    String breed;
    int run; // 500 m
    int swim; // don't swim without urgency
    int jump; // 1.5 m
    boolean fly; // false

    public Cat() {
        this.animalType = "кот";
        this.name = "Мурзик";
        this.breed = "Сфинкс";
        this.run = 500;
        this.swim = 50;
        this.jump = 2;
        this.fly = false;
    }

    public void run (int distance) {
        if (distance <= 0){
            System.out.println(animalType + " стоит на месте.");
        } else if (run > distance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("К сожалению, " + name + " не сможет пробежать " + distance + " метров.");
        }
    }

    public void swim (int distance) {
        if (distance <= 0){
            System.out.println(animalType + " стоит на месте.");
        } else if (swim > distance) {
            System.out.println(name + " проплыл " + distance + " метров ");
        } else {
            System.out.println("К сожалению, " + name + " не сможет проплыть " + distance + " метров ");
        }
    }

    public void jump (int distance) {
        if (distance <= 0){
            System.out.println(animalType + " стоит на месте.");
        } else if (jump > distance) {
            System.out.println("Вау! " + name + " прыгнул на " + distance + " метров! ");
        } else {
            System.out.println("К сожалению, " + name + " не сможет прыгнуть " + distance + " метров ");
        }
    }

    public void fly (int distance) {
        if (!fly){
            System.out.println("К сожалению " + animalType + " не летает");
        } else if (distance <= 0){
            System.out.println(animalType + " стоит на месте.");
        }
    }
}

