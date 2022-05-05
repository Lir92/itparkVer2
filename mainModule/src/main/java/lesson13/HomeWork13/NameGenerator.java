package lesson13.HomeWork13;

import java.util.Random;

public class NameGenerator {

    public static void main(String[] args) {

        String[] familyName = {"Алигьери", "Алксеев", "Андерсон", "Базаров", "Басников", "Бах", "Беккер", "Беркут",
                "Блок", "Васильев", "Вассерман", "Верба", "Горелый", "Горшенёв", "Иванов", "Кант", "Кипелов", "Князев", "Коробочка",
                "Король", "Ленон", "Лермонтов", "Линдеман", "Маврин", "Макартни", "Маяковский", "Ницше", "Онегин", "Петров",
                "Печенька", "Печорин", "Плюшкин", "Пожарский", "Путин", "Пух", "Пушной", "Романов", "Сахаров", "Селезнев", "Сидоров",
                "Собакевич", "Танкян", "Ульянов", "Фаренгейт", "Хоук", "Цой", "Цукерберг", "Чайковский", "Чацкий", "Чичиков"};

        String[] givenName = {"Александр", "Андрей", "Борис", "Василий", "Владимир", "Георгий", "Григорий", "Даниил",
                "Дмитрий", "Евгений", "Елисей", "Иван", "Илья", "Кирилл", "Константин", "Лев", "Леонид", "Максим", "Михаил",
                "Никита", "Руслан", "Тихон"};

        String[] patronymicName = {"Алексеевич", "Владимирович", "Кириллович", "Николаевич", "Олегович", "Петрович",
                "Романович", "Сергеевич", "Станиславович", "Тимофеевич", "Фёдорович", "Яковлевич", "Богданович", "Ярославович",
                "Родионович", "Феофанович", "Александрович", "Валерьянович", "Константинович", "Евгеньевич"};

//        Random random = new Random();
//        int randomName = random.nextInt(familyName.length);
//
//        random = new Random();
//        int randomGivenName = random.nextInt(givenName.length);
//
//        random = new Random();
//        int randomPatronymicName = random.nextInt(patronymicName.length);

        //String fullName = (familyName[randomName] + " " + givenName[randomGivenName] + " " + patronymicName[randomPatronymicName]);

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomName = random.nextInt(familyName.length);

            random = new Random();
            int randomGivenName = random.nextInt(givenName.length);

            random = new Random();
            int randomPatronymicName = random.nextInt(patronymicName.length);

            random = new Random();
            int ID = random.nextInt(100, 500);

            System.out.println(ID + " " + familyName[randomName] + " " + givenName[randomGivenName] + " " + patronymicName[randomPatronymicName]);
        }

//        for (int i = 0; i < 10; i++) {
//            Random random = new Random();
//            int ID = random.nextInt(100, 500);
//            System.out.println(ID);
//        }
    }
}
