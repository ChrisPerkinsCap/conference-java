package org.pluralsight.java.service;

import org.pluralsight.java.model.Speaker;
import org.pluralsight.java.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;
    @Override
    public List<Speaker> findAll() {

        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}