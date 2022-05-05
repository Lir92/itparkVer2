package lesson10.enumeration;

public enum Language {

    RUSSIAN(1), ENGLISH(2), GERMAN(3), FRENCH(4); // сначала идёт перечисление констант, а потом какое-то их поведение.

    private int index;

    // при объявлении конструктора, мы обязаны сделать индексацию констант
    Language(int index) {
        this.index = index;
    }

    public static Language as (int index) {
        for (Language language: values()){ // values() - этот метод хранит в себе массив всех констант, которые есть в перечислении
            if (language.index == index){
                return language;
            }
        }
        return Language.RUSSIAN;
    }
}
