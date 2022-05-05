//package lesson39.config;
//
//import lesson39.dao.impl.PersonDaoImpl;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.aop.ClassFilter;
//import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.MethodMatcher;
//import org.springframework.aop.Pointcut;
//import org.springframework.aop.support.DefaultPointcutAdvisor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Slf4j
//@Configuration
//public class LoggingAspectConfiguration {
//
//    public Pointcut personDaoSimpleLoggingAspectPointcut() {
//        return new Pointcut() {
//            @Override
//            public ClassFilter getClassFilter() {
//                return clazz -> clazz.equals(PersonDaoImpl.class);
//            }
//
//            @Override
//            public MethodMatcher getMethodMatcher() {
//                return MethodMatcher.TRUE;
//            }
//        };
//    }
//
//    MethodBeforeAdvice personDaoSimpleLoggingAspectBeforeAdvice() {
//        return (method, objects, o) -> log.info("Вызов метода : " + method.getName());
//    }
//
//
//    @Bean
//    public DefaultPointcutAdvisor personDaoSimpleLoggingAspectAdvisor() {
//        return new DefaultPointcutAdvisor(personDaoSimpleLoggingAspectPointcut(),
//                personDaoSimpleLoggingAspectBeforeAdvice());
//    }
//}