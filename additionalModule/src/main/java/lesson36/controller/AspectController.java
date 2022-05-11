package lesson36.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@Slf4j
@Validated
@RestController
public class AspectController {

    // почему-то нет подключения по адресу localhost:8081/logger... В браузере выдаёт 404 ошибку без записи лога.

    @GetMapping("/logger")
    public void aspect(@RequestParam @NotEmpty String method, @RequestParam String params) {
        log.info("Вызываем метод {} с параметрами {}", method, params);
    }
}