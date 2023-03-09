package org.pluralsight.java.repository;

import org.pluralsight.java.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
