package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.entities.OrganizerEntity;

import java.util.List;
import java.util.Optional;

public interface OrganizerService {

    OrganizerEntity createOrganizer(OrganizerEntity request);

    public List<OrganizerEntity> getAllOrganizer();

    Optional <OrganizerEntity> getById(int id);

}
