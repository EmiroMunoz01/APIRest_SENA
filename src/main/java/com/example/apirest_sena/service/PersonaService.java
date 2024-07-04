package com.example.apirest_sena.service;

import com.example.apirest_sena.entity.Persona;
import com.example.apirest_sena.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> getPersona() {
        return personaRepository.findAll();
    }

    //con opcional indicamos que no sabemos si va a llegar
    public Optional<Persona> getPersonaById(Long id) {
        return personaRepository.findById(id);
    }

    public void saveOrUpdatePersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void delete(Long id) {
        personaRepository.deleteById(id);
    }

}
