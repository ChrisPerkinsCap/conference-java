package org.pluralsight.java.repository;

import org.pluralsight.java.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("John");
        speaker.setLastname("Little");

        speakers.add(speaker);

        return speakers;
    }
}
