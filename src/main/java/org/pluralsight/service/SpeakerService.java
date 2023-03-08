package org.pluralsight.service;

import org.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
