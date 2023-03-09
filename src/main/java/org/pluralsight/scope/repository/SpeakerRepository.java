package org.pluralsight.scope.repository;

import org.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
