package org.pluralsight.config.service;

import org.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
