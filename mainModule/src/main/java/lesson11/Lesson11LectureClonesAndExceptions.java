package lesson11;

public class Lesson11LectureClonesAndExceptions {

    /*
============================================== Клонирование ============================================================
    Клонирование доступно либо при расширении в иерархии, либо пользуясь в том же самом пакете.
    Для клонирования, необходимо:
    1 - имплементить интефейс Cloneable в определяющий класс (где указаны основные объекты)\
    2 - сделать override класса Object и override toString                                / при таком методе клонируются полностью идентичные объекты
    выше указано поверхностное клонирование (Shallow clone)

    для того, что бы сделать полностью разные объекты (Deep clone), также необходимо:
    3 - в класс Engine имплементить интерфейс маркер Cloneable и override Object clone в этом же классе. Там указываем
    переменную того типа из которого клонируем (н-р Car) и делаем её super.clone() приведённой к типу Car.

    Cloneable - является интерфейс маркером, т.е. это интерфейс у которого нет никаких методов.

============================================= Исключения (Ошибки) ======================================================

    Исключения появляются, если программа работает не корректно:
     - некорректно ввели данные;
     - сбой оборудования;
     - нарушение ограничений среды;
     - выполнение программного кода.

    Обрабатывать исключения нужно обрабатывать при помощи try и catch.

    Исключения могут быть Ошибки (Error) и Исключения (Exception). Все эти ошибки/исключения являются Throwable -
    выбрасываемые.

    Исключения могу быть проверяемые и не проверяемые:
    Проверяемы исключения - обрабатываются компилятором. Примером проверяемых ошибок может быть попытка обратиться к
    несуществующему или закрытому файлу. Компилятор может это проверить и предупредить и тогда можно завернуть такую
    ошибку в соответствующий try-catch блок, что бы предотвратить вылетание программы.

    Исключения типа Exception являются проверяемыми.
    Исключения типа Error являются не обрабатываемыми, их необходимо исправлять вручную.

    Непроверяемые исключения - непроверяемые ошибки необходимо проверять для того, что бы не было ошибки компиляции
    (н-р ошибка деления на 0, которая не проверится компилятором заранее).

    Проверяемые ошибки можно пробрасывать выше до метода main. Когда исключения пробрасываются, это означает, что
    обработка будет проведена позже. Пробрасываемые исключения можно указывать через запятую или указывть throws Exception -
    это пробросит все появившиеся исключения.

    Лучше всего объединять try-catch блоки, если они повторяются в методе.

    При обработке исключений необходимо сначала обрабатывать более ускоспециализированные блоки, а затем более широкие.

    Если исключение будет из непроверяемых и не предусмотрена для него проверка, то программа остановится с ошибкой.

    Блоки try и finally могут быть только по одному, блоки catch может быть много.
     */
}
