package org.pluralsight.service;

import org.pluralsight.model.Speaker;
import org.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import org.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll() {

        return repository.findAll();
    }
}
