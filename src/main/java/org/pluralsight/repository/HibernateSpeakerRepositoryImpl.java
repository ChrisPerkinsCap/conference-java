package org.pluralsight.repository;

import org.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    private List<Speaker> speakers = new ArrayList<>();

    public HibernateSpeakerRepositoryImpl() {
        Speaker speaker = new Speaker();

        speaker.setFirstName("John");
        speaker.setLastname("Little");

        speakers.add(speaker);
    }
    @Override
    public List<Speaker> findAll() {
        return this.speakers;
    }
}
