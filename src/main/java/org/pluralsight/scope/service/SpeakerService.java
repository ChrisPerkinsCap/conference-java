package org.pluralsight.scope.service;

import org.pluralsight.scope.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
