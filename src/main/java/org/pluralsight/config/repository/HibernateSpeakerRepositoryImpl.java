package org.pluralsight.config.repository;

import org.pluralsight.model.Speaker;
import org.pluralsight.repository.SpeakerRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Dave");
        speaker.setLastname("Hedgehog");

        speakers.add(speaker);

        return speakers;
    }
}
