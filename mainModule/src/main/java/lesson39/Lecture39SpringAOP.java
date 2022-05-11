package lesson39;

public class Lecture39SpringAOP {
    /*
    AOP - аспектно-ориентированное программирование.
    Spring основан на AOP. Прямое использование АОП достаточно редко.
    АОП отличается от ООП тем, что ООП - парадигма, в то время как АОП - расширение.
    AOP включает - Cross-cutting - нефункциональные требования, которые не относятся к бизнесс-логике
                 - АОП
                 - Аспект
                 - AspectJ
                 - Spring AOP
                 - Прокси

    Cross-cutting - сквозная функциональность: логирование,
                                               кэширование,
                                               транзакции,
                                               проверка прав,
                                               обработки исключений,
                                               benchmarking - проверка производительности.
    !!! В Cross-cutting бизнесс-логики нет !!!

    В ООП есть решения для Cross-cutting функциональности, но обычно это не очень удобно использовать.
    При АОП всю Cross-cutting функциональность можно выносить отдельно.

    ============================== Аспект

    Аспект - это специализированный класс, который описывает какую Cross-cutting логику применять в заданных точках приложения.
    Аспекты пишутся на разных технологиях, например AspectJ.
    Spring AOP - базовая фунциональность Spring, используюящая AspectJ.

    Аспекты в коде обозначаются аннотацией @Aspect.

    Прокси:
        JDK прокси может работать только с публичными классами.
        CGLib прокси может работать уже с protected.
    Не смотря на 2 разные возможности создания прокси, Spring все прокси создаёт при помощи JDK, поэтому разницы нет.

    == Weaving - процесс применения кода аспекта к оригинальному коду (связывание, объекдинение с JoinPoint)

    Вида Weaving: compile time weaving - аспекты внедряются в классы на этапе компиляции. Делается при помощи плагина
                                         Maven. Аннотация @Component над аспектами не ставится.

                  load time weaving - аспекты внедряются в классы на этапе загрузки в JVM. Делается это через инструментацию
                                      (агент). Для него дополнительно требуется aop.xml и не ставится аннотация @Component.
                                      Данным видом можно управлять при помощи Spring аннотацией @EnableLoadTimeWeaving.

                  Runtime weaving - здесь аспекты это бины внутри прокси. В этом случае аннотация @Component ОБЯЗАТЕЛЬНА.
                                    Данный вид используется в Spring и за него отвечает зависимость aspectj-weaver (в pom.xml)

    ---------------------------------
    Для того работы с аспектами необходимо подключить aspectjrt и aspectjweaver зависимости в pom.xml. Также подключается
    зависимость spring-aop.
    ---------------------------------

    ====================================== ADVICE ======================================

    Advice - действие, которое выполняется помимо JointPoint (это метод, на котором вызывается прокси).

    В Аспектах может быть несколько Advice-ов.

    На один метод может быть навешено несколько Advice-ов из разных Аспектов.

    В отличие от Аспектов, которые можно упорядочить при помощи аннотации @Order(), Advice не всегда получится упорядочить.

    Виды Advice-ов: @Before - выполняется перед точкой входа в метод (можно и не входить в метод);
                    @After - выполняется после точки входа в метод (даже после исключения);
                    @Around - выполняется перед и после точки входа в метод;
                    @AfterReturning - выполняется после того, как точка входа завершилась корректно;
                    @AfterThrowing - выполняется после получения исключения в точке входа.

    ====================================== POINTCUT ======================================

    Pointcut - это язык описания мест Joint point. В нём описывается место, где должен примениться Advice.


     */
}
