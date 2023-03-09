package org.pluralsight.config.service;

import org.pluralsight.model.Speaker;
import org.pluralsight.repository.SpeakerRepository;
import org.pluralsight.service.SpeakerService;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }
    @Override
    public List<Speaker> findAll() {

        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
