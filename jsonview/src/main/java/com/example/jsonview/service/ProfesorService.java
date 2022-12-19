package com.example.jsonview.service;

import com.example.jsonview.model.Profesor;
import com.example.jsonview.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesorService {

    private final ProfesorRepository repository;

    public List<Profesor> getall(){
        return repository.findAll();
    }

    public Profesor add(Profesor profesor){
        return repository.save(profesor);
    }
}
