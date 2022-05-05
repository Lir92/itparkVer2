package lesson33.controller;

import lesson33.dto.ResultDto;
import lesson33.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@RestController // = @Controller + @ResponseBody
@RequiredArgsConstructor
@RequestMapping("/calculator")
public class InputController {

    @Value("${spring.application.name}}")
    private String application;

    private final CalculatorService calculatorService;

    private HttpServletRequest request; // тут хранятся пользовательские запросы пока они обрабатываются на бэк-энде.
    // Для более долгого хранения таких данных стоит использовать ServletSession.

//    @RequestMapping(value = "/sum", method = RequestMethod.POST) // данный метод меппинга более общий и в нём необходимо переопределять больше параметров.
    //Вместо этого можно использовать более направленные меппинги, как ниже @PostMapping("/sum")
    @PostMapping("/sum")
    public ResponseEntity<ResultDto> sum(
            HttpServletRequest request, HttpServletResponse response, // если эти поля необходимы только в редких методах, то вемсто определения их в качестве полей класса
            // можно использовать в качестве параметров метода.
            @RequestParam(value = "arg1", required = true, defaultValue = "0") Integer a, // required = true - данный параметр по умолчанию стоит true,
            // т.е. клиент обязан указать данный параметр, что бы программа отработала. Если необходимо сделать какой-либо параметр не обязательным, то
            // выставляем его в значение false: required = false. В дополнение к этому, можно указать умолчательное значение параметра, н-р defaultValue = "0".
            @RequestParam("arg2") Integer b,
            @CookieValue(value = "cookieAttribute", required = false) String cookieAttribute) {
        request.getSession().setAttribute("sessionAttribute", "125");
        if (a > 100) {
//            return ResponseEntity.internalServerError().build(); // в случае невыполнения условия будет ошибка.
            return ResponseEntity.internalServerError()
                    .body(new ResultDto(application, -1));
        }
        return ResponseEntity.ok(new ResultDto(application, calculatorService.sum(a, b)));
    }

    @GetMapping("/sum/{arg1}/{}arg2")
    public Integer getSum(@PathVariable Integer arg1, @PathVariable Integer arg2) {
        String sessionAttribute = Objects.toString(request.getSession().getAttribute("sessionAttribute"));
        return calculatorService.sum(arg1, arg2);
    }
}
