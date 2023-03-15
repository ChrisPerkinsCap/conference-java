package org.pluralsight.service;

import org.pluralsight.model.Speaker;
import org.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor.");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor.");
        repository = speakerRepository;
    }

    @PostConstruct
    private void initialise () {
        System.out.println("I get called after the constructors!");
    }

    @Override
    public List<Speaker> findAll() {

        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter.");
        this.repository = repository;
    }
}
