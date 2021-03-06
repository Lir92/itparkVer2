package lesson19;

public class Lesson19LectureReflectionAPI {
    /*
    Потоки ввода / вывода и их разновидности:

    InputStream / OutputStream - читает / пишет данные в байтах.
    FileReader / FileWriter - читает / пишет данные в символах.

    Файлы лучше читать не целиком, а при помощи BufferedReader, так как тогда считывается часть информации и хранится до
    необходимости записи или обработки. Такие буфферы необходимо закрывать и сбрасывать, что бы не занимать ресурсы.
    Сбрасывать данные в файл, куда идёт записи, делается при помощи команды =.flush()=

  === Сериализация / Десериализация - превращение объектов в бинарную форму для передачи по сети.

  ===== Рефлексия и Reflection API ===

    Reflection API даёт возможность изменять значения приватных и финальных полей класса.
    Reflection при помощи Class даёт возможность получить информацию о классе: какие есть методы, поля и др. Также можно
  получать информацию о всех наследуемых методах.

    При помощи super class можно получить информацию о всех наследуемых и имплементированных полях и методах в классе.


  ===== Загрузчик класса (Class Loader) =====
  Class Loader - бывает базовый или кастомный. При запуске приложения, классы подгружаются от более базового.
  Однако, запуск классов происходит от переопределённых к базовым, т.е. сначала загрузится "пользовательский" класс и
  только потом подгрузится системный класс, если "пользовательского" класса нет.

     */
}
