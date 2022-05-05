package lesson11;

public enum OrganizationType {
    OAO(1, "ОАО"), ZAO(2, "ЗАО"), OOO(3);

    private final int number;
    private String name;

    OrganizationType(int number) { // конструктор для имени
        this.number = number;
    }

    OrganizationType(int number, String russianName) { // перегруженный конструктор
        this.number = number;
        this.name = russianName;
    }

    public int getNumber() {
        return number;
    }

    public String getRussianName() { // метод для вывода русского значения, указанного в качестве значения константы.
        return name;
    }

}
