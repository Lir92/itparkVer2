package lesson20;

public class Lecture20 {
    /*
  ===== Аннотации (example in lesson 19) =====
    @Deprecated - аннотация позволяет пометить метод или класс, сообщая о том, что в последующих версиях это будет удалено;
    @SuppressWarnings - возможность игнорирования каких-либо уведомлений;
    (пр-р исп-я: @SuppressWarnings(String warningsName)
 ** @DocumentedAnnotations - создание собственных аннотаций


 !!! TODO: Почитать про динамический proxy: как работает, как создавать, как использовать.

---------------------------------------------------- ЯЗЫКИ РАЗМЕТКИ ----------------------------------------------------

    1)xml
    2)json
    3)csl

========================================================= XML ==========================================================

 == XML - служит для работы с другими программами и обменом информации.
    XML - это язык разметки, поддерживающий не только стандартные теги, но и кастомные (от разработчика).

    Теги можно писать как в нижнем регистре, так и с использованием CamelCase.

    Корневой тег в xml может быть только один.

    <!-- текст --> - таким образом обозначаются комментарии

    Для проверки xml-документа можно использовать при помощи браузера: если файл открывается в браузере, значит всё в
    порядке.

    Можно типизировать теги, указывать какие теги обязательны, делать вложенные теги.

 ** В отдельныетеги стоит выносить:
        аттрибуты, связанные с физическими хар-ками объекта: идентификаторы, название.
 ** Во вложенные теги стоит добавлять:
        аттрибуты, связанные с нестатичекими объектами (н-р. инф-я о пользователе объекта, его характеристики)

    XML часто используется в Web-сервисах.

==== Java API for XML Processing (JAXP)

==== JAXB

    Маршалинг (Marshal) - технология для создания объекта из xml документа
    Анмаршалинг (Unmarshal) - технология обратная маршалингу

==== JSON

 == JSON, в отличие от XML, более лаконичен и также как и XML предназначен для работы с другими программами и обменом
    информации.

    JSON даёт возможность JS взаимодействовать с различными объектам, как к полям.

==== XPATH

    Способ поиска знчений в xml-файле и обработки значений.

     */
}
