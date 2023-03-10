package org.pluralsight.config;

import org.pluralsight.config.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean( "speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastname());
    }
}
