package lesson7.HomeWorkLesson7;

public class Parrot {
    String animalType;
    String name;
    String breed;
    int run; // 0 m, he prefers to fly
    int swim; // unfortunately, he cannot swim.
    int jump; // 0 m, that's not parrot's business
    int fly; // true

    public Parrot() {
        this.animalType = "попугай";
        this.name = "Кеша";
        this.breed = "Волнистый";
        this.run = 0;
        this.swim = 0;
        this.jump = 0;
        this.fly = 1000;
    }

    public void fly (int distance) {
        if (0 >= distance){
            System.out.println(animalType + " стоит на месте.");
        } else if (fly > distance){
            System.out.println(name + " пролетел " + distance + " метров.");
        }
    }
}
