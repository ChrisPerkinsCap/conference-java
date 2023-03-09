package org.pluralsight.java;

import org.pluralsight.java.repository.HibernateSpeakerRepositoryImpl;
import org.pluralsight.java.repository.SpeakerRepository;
import org.pluralsight.java.service.SpeakerService;
import org.pluralsight.java.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl();

        service.setRepository(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
