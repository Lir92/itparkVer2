package lesson9;

public class Lesson9LectureIncapsulation {

    /*
    ===== Повторение =====
    Инкапусляция - это скрытие кодовой информации в классах и методах, выполняющих внутренние операции.
    Пример инкапсуляции является модификатор privat - который не позволяет изменять данные кода конечному пользователю.

    Ключи доступа инкапсуляции:

    (от самого узкого до самого широкого доступа)

    privat - можно получить доступ к методу только внутри класса.

    отсутствие модификатор или privat package (e.x. метод - void methodName) - доступен во всех класса в
                    рамках одного пакета.

    protected - можно получать доступ к методам внутри пакета, самого класса и в классах-потомках.

    public - можно получить доступ к методам в других классах.


    Наследование -
    В родительском классе должны быть указаны основные характеристики, которые будут проялвяться у классов предков.
    extens - модификатор создающий наследника - newClass.extens.parentClass

    Полиморфизм -
    ======================

    модификатор final - может использоваться на имени ксласса,
                                                при объявлении переменных,
                                                при обозначении методов.

    final необходим для того, что бы не дать возможность изменять то, к чему относится этот модификатор.

    Использование final на классе ограничивает возможности наследования класса. Такое необходимо делать, если есть класс,
    который должен быть неизменяемым и что бы нельзя было переопределить методы этого класса (например класс с константами).

    Использование final на переменных (полях) - определяет переменную константой, которая не изменится и не переопределится.

    Использование на метода - заищищает метод от переопределений в других классах.

    -------------------------------------------------------------------
    модификатор abstract - модификатор противоположный final. Он заставляет разработчика расширять и переопределять класс,
    который был им определён в других классах. Например таким модификатором может быть определён родительский класс.

    при использовании модификатора abstract на методе, то будет создан абстрактный метод, не имеющий логики.

    Если в классе есть хотя бы один абстрактный метод, класс также должен быть абстрактным. В абстрактных классах могут
    могут быть абстрактные методы, которые необходимо также переопределять.
    --------------------------------------------------------------------
    К модификатору final относятся классы String, Mass и обётрки классов.

    Final поля нельзя изменять или инициализировать повторно в конструкторе, если оно было сразу определено, иначе его
    необходимо явно проинициализировать в конструкторе.

    final можно определить поле, которое критично важно для работы.
    --------------------------------------------------------------------
    Пакеты - сборник классов общей тематики. Помогает избежать повторения имён классов.
        */
}