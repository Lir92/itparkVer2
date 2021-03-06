package lesson32.conttroller;

import lesson32.event.PrintEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestComponent {

    @EventListener
    public void handle(PrintEvent event) {
        log.info("Test component catch event {}", event);
    }
}
