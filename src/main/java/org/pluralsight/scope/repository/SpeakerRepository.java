package org.pluralsight.scope.repository;

import org.pluralsight.scope.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
