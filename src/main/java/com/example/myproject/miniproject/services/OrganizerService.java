package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.dto.OrganizerDto;
import com.example.myproject.miniproject.entities.Organizer;

import java.util.List;
import java.util.Optional;

public interface OrganizerService {

    Organizer createOrganizer(Organizer request);

    public List<OrganizerDto> getAllOrganizer();

    Optional <Organizer> getById(int id);

}
