package pjatk.mas.imp;

import javafx.application.Application;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class Start {
    @EventListener(ApplicationReadyEvent.class)
    public void start(){

    }
}
