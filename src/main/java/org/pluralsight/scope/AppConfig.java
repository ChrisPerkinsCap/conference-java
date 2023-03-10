package org.pluralsight.scope;

import org.pluralsight.scope.repository.HibernateSpeakerRepositoryImpl;
import org.pluralsight.scope.repository.SpeakerRepository;
import org.pluralsight.scope.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean (name = "speakerService")
    public SpeakerServiceImpl getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean (name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
