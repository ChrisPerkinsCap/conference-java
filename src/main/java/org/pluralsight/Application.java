package org.pluralsight;

import org.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import org.pluralsight.repository.SpeakerRepository;
import org.pluralsight.service.SpeakerService;
import org.pluralsight.service.SpeakerServiceImpl;


public class Application {

    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastname());
    }
}
