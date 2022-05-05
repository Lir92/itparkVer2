package lesson8.HomeWork8;

public class AnimalChoir {

    public static void main(String[] args) {
        AnimalVoice dog = new Dog("Dog goes \"woof\"");
        AnimalVoice cat = new Cat("Cat goes \"meow\"");
        AnimalVoice bird = new Bird("Bird goes \"tweet\"");
        AnimalVoice mouse = new Mouse("And mouse goes \"squeek\"");
        AnimalVoice fox = new Fox("But there's one sound that no one knows");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(bird);
        System.out.println(mouse);
        System.out.println(fox);

        fox.voice();

        dog.setVoice("Gering-ding-ding-ding-dingeringeding!");
        cat.setVoice("Wa-pa-pa-pa-pa-pa-pow!");
        bird.setVoice("Hatee-hatee-hatee-ho!");
        mouse.setVoice("Joff-tchoff-tchoffo-tchoffo-tchoff!");

        AnimalVoice [] sounds = new AnimalVoice[]{dog, cat, bird, mouse};
        for (AnimalVoice animalVoice : sounds){
            System.out.println(animalVoice);
        }

        System.out.println("------------------");
        // вызов звуков животных, которые определены в классе животного.
        AnimalVoice [] animal = new AnimalVoice[] {dog, cat, bird, mouse};
        for (AnimalVoice newVoice : animal){
            newVoice.voice();
        }

    }
}
