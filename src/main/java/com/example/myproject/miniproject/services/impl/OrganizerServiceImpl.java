package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.entities.OrganizerEntity;
import com.example.myproject.miniproject.repositories.OrganizerRepository;

import com.example.myproject.miniproject.services.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizerServiceImpl implements OrganizerService {

        @Autowired
        OrganizerRepository organizerRepository;

        public OrganizerEntity createOrganizer(OrganizerEntity request){
            organizerRepository.save(request);
            return request;
        }

        public List<OrganizerEntity> getAllOrganizer() {
            return organizerRepository.findAllSortedByNameUsingNative();
        }

        public Optional <OrganizerEntity> getById(int id) {
            return organizerRepository.findByIdUsingNative(id);
        }
}
