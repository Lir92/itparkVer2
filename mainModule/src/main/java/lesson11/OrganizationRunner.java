package lesson11;

public class OrganizationRunner {

    public static void main(String[] args) {
        System.out.println(OrganizationType.OAO.ordinal()); // так получаем порядковый номер в из класса перечисления
        System.out.println(OrganizationType.OAO.getNumber());
        System.out.println(OrganizationType.OAO.getRussianName()); /* получаем тип компании на русском языке. Русское
        русское значение указывается в скобках у константы */
    }
}
