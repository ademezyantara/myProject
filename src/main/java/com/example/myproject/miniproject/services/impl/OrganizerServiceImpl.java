package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.dto.OrganizerDto;
import com.example.myproject.miniproject.entities.Organizer;
import com.example.myproject.miniproject.repositories.OrganizerRepository;

import com.example.myproject.miniproject.services.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrganizerServiceImpl implements OrganizerService {

        @Autowired
        OrganizerRepository organizerRepository;

        public Organizer createOrganizer(Organizer request){
            organizerRepository.save(request);
            return request;
        }

        public List<OrganizerDto> getAllOrganizer() {
            List<Organizer> organizers = organizerRepository.findAllSortedByNameUsingNative();
            return organizers
                    .stream()
                    .map(
                            thisOrganizer ->
                                    OrganizerDto
                                            .builder()
                                            .name(thisOrganizer.getName())
                                            .address(thisOrganizer.getAddress())
                                            .build()
                    )
                    .collect(Collectors.toList());
        }



        public Optional <Organizer> getById(int id) {
            return organizerRepository.findByIdUsingNative(id);
        }
}
