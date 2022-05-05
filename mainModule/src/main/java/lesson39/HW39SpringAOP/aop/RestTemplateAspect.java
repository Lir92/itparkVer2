//package lesson39.HW39SpringAOP.aop;
//
//import lombok.RequiredArgsConstructor;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//@Aspect
//@RequiredArgsConstructor
//public class RestTemplateAspect {
//
//    private final RestTemplate restTemplate;
//
//    @Before("execution(* lesson39.HW39SpringAOP.service.impl.CityDictionaryServiceImpl*(..))") // выполняется при вызове метода "CityDictionaryServiceImpl"
//    public void logBefore(JoinPoint joinPoint) {
//
//    }
//}
