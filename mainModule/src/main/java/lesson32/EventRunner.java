package lesson32;

import lesson32.service.ServiceA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(EventRunner.class, args);
        ServiceA serviceA = appContext.getBean(ServiceA.class);
        serviceA.sendEvent("Здесь могла быть ваша реклама");
    }
}
