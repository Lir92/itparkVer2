package lesson43;

public class Lecture43MicroservicesAndMonolith {
    /*
    Монолит - это одно приложение. Монолитные приложения могут быть разбиты на модули (Maven) и деплоится, как единый юнит.
              В монолитном приложении включены все бизнес-кейсы и при падении падает всё приложение сразу.

    Плюсы: - простота работы;
           - не сложно поддерживать работающую программу;
           - просто локализовывать проблемы;
           - быстродейсвтие - вызовы осуществляются на уровне Java-API - обычный Java вызов, не влияющий на быстродействие;
           - просто сделать транзакцию.
    Минусы: - сложно добавлять новый функционал без переписывания исходного кода;
            - слабая устойчивость к большим непредвиденным нагрузкам.

------------------------------------------------------------------------------------------------------------------------

    Микросервисы - каждая бизнес-функция - это отдельный сервис. Микросервисная архитектура имеет децентрализованное
                   управление, версионное, деплой, управление БД(каждый мкиросервис должен иметь свою БД).

    Плюсы: - разные микросервисы могут разрабатывать разные команды;
           - разные сервисы отвечают за свою логику, которые не пересекаются;
           - легко обновлять и заменять сервисы, не останавливая работу всего приложения;
           - можно писать на разных языках;
           - хорошо масштабируются горизонтально;
           - сервисы можно ставит на разные сервера.
    Минусы: - проблемно управлять версиями;
            - проблемы с отзывчивостью;
            - сложно искать проблемные моменты в работе программы, так как много сервисов и не понятно, что именно вызвало;
            - высокая сложность рещения и высокая стоимость на начальном этапе разработки;
            - меньшая надёжность;
            - риск получения распределённого монолита.

    Проект от Spring Boot для микросервисной архитектуры - Spring Actuator

========================================================================================================================
    ВЫВОД: в самом начале разработке стоит выбрать монолитную архитектуру и с развитием проекта переходить к микросервисной
           архитектуре.
========================================================================================================================

     */
}