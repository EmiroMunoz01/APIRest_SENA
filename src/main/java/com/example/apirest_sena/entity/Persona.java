package com.example.apirest_sena.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tabla_personas")
public class Persona {
//comentario de verificacion
    @Id
    private long id;

}
