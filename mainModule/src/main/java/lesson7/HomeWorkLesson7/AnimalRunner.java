package lesson7.HomeWorkLesson7;

import java.util.Scanner;

public class AnimalRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название животного с которым хотите поиграть - собака, кот, тигр, попугай: ");
        String animal = scanner.next();


        scanner = new Scanner(System.in);
        System.out.print("Какую команду хотите дать? бежать, плавать, прыгать, летать: ");
        String command = scanner.next();


        scanner = new Scanner(System.in);
        System.out.print("Укажите на сколько метров пробежит/ проплывёт/ пролетит или на сколько прыгнет животное: ");
        while (!scanner.hasNextInt()){
            String text = scanner.next();
            System.out.print(text + " не является числом. Необходимо ввести число, попробуйте ещё раз: ");
        }
        int distance = scanner.nextInt();


        // Блок логики про собаку
        if (animal.equals("собака")){
            Dog myDog = new Dog();

            if (command.equals("бежать")){
                myDog.run(distance);
            }
            if (command.equals("плавать")){
                myDog.swim(distance);
            }
            if (command.equals("прыгать")){
                myDog.jump(distance);
            }
            if (command.equals("летать")){
                myDog.fly(distance);
            }
        }

        // Блок логики про кота
        if (animal.equals("кот")){
            Cat myCat = new Cat();

            if (command.equals("бежать")){
                myCat.run(distance);
            }
            if (command.equals("плавать")){
                myCat.swim(distance);
            }
            if (command.equals("прыгать")){
                myCat.jump(distance);
            }
            if (command.equals("летать")){
                myCat.fly(distance);
            }
        }

        // Блок логики про тигра
        if (animal.equals("тигр")){
            Tiger myTiger = new Tiger();

            if (command.equals("бежать")){
                myTiger.run(distance);
            }
            if (command.equals("плавать")){
                myTiger.swim(distance);
            }
            if (command.equals("прыгать")){
                myTiger.jump(distance);
            }
            if (command.equals("летать")){
                myTiger.fly(distance);
            }
        }

        // Блок логики про попугая
        if (animal.equals("попугай")){
            Parrot myParrot = new Parrot();

            if (command.equals("бежать")){
                System.out.println("Попугаю не надо бегать, он может просто улететь!");
            }
            if (command.equals("плавать")){
                System.out.println("Попугаи не плавают, максимум умываются по утрам (^_^)");
            }
            if (command.equals("прыгать")){
                System.out.println("Попугаи не прыгают особо, у них есть же крылья!");
            }
            if (command.equals("летать")){
                myParrot.fly(distance);
            }
        }
    }
}