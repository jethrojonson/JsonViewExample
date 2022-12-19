package com.example.jsonview.controller;

import com.example.jsonview.model.Profesor;
import com.example.jsonview.repository.ProfesorRepository;
import com.example.jsonview.service.ProfesorService;
import com.example.jsonview.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
@RequiredArgsConstructor
public class ProfesorController {

    private final ProfesorService service;

    @JsonView(Views.ProfesorFull.class)
    @GetMapping("/")
    public ResponseEntity<List<Profesor>> getAll() {
        List<Profesor> result = service.getall();
        return ResponseEntity.ok(result);
    }

    @JsonView(Views.ProfesorFull.class)
    @PostMapping("/")
    public ResponseEntity<Profesor> addProfesor(@JsonView(Views.ProfesorSimple.class) @RequestBody Profesor profesor){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.add(profesor));
    }



}
