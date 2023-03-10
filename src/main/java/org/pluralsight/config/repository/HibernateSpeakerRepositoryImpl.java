package org.pluralsight.config.repository;

import org.pluralsight.config.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Doogle");
        speaker.setLastname("McDermot");

        speakers.add(speaker);

        return speakers;
    }
}
