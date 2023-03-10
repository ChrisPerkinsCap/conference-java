package org.pluralsight.config.service;

import org.pluralsight.config.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
