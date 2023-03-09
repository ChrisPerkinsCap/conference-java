package org.pluralsight.java.service;

import org.pluralsight.java.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
