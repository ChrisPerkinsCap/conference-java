package org.pluralsight.config.repository;

import org.pluralsight.config.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
