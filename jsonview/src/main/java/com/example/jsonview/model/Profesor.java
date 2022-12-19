package com.example.jsonview.model;

import com.example.jsonview.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profesor {

    @Id
    @GeneratedValue
    @JsonView(Views.ProfesorCompleto.class)
    private Long id;

    @JsonView(Views.ProfesorSimple.class)
    private String name;

    @JsonView(Views.ProfesorSimple.class)
    private String apellidos;

    @JsonView(Views.AddNewProfesor.class)
    private String dni;

    @JsonView(Views.AddNewProfesor.class)
    private int edad;

}
