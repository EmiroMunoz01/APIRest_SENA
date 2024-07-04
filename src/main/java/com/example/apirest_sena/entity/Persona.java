package com.example.apirest_sena.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tabla_personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long personaId;

    private String nombre;

    private String apellido;


    private String edad;

    @Column(name = "email_direccion", unique = true, nullable = false)
    private String email;
}
