package lesson26.HW26TeachersVersion;

import lesson26.HW26CurrencyGiude.CurrencyGuideRunner;
import lesson26.HW26TeachersVersion.service.ValuteFetcher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson26.HW26TeachersVersion")
public class SpringValuteRunner {

    // Данная реализация ДЗ делается при помощи JsonPath

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SpringValuteRunner.class);
        ValuteFetcher bean = appContext.getBean(ValuteFetcher.class);

        System.out.println(bean.getValueByCode("GBP"));
    }



}
