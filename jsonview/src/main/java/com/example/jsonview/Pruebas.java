package com.example.jsonview;

import com.example.jsonview.model.Profesor;
import com.example.jsonview.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class Pruebas {

    private final ProfesorRepository profesorRepository;

    @PostConstruct
    public void run() {

        Profesor p1 = Profesor.builder()
                .name("Paco")
                .apellidos("Perez")
                .dni("4521369L")
                .edad(45)
                .build();

        profesorRepository.save(p1);


    }


}
