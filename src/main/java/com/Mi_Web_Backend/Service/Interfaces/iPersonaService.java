package com.Mi_Web_Backend.Service.Interfaces;

import com.Mi_Web_Backend.Entitys.Persona;

import java.util.List;

public interface iPersonaService {

    public List<Persona> getPersonas();

    public void savePersona(Persona per);

    public void deletePersona(Integer id);

    public Persona findPersona(Integer id);

}
