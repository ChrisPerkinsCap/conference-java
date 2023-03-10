package org.pluralsight.scope.service;

import org.pluralsight.scope.model.Speaker;
import org.pluralsight.scope.repository.SpeakerRepository;

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
