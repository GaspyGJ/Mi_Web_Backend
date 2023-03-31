package com.Mi_Web_Backend.Service.Interfaces;

import com.Mi_Web_Backend.Entitys.Experiencia;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iExperienciaService {

    public List<Experiencia> getExperiencias();
    
    public Optional<Experiencia>  getHardSkillByID(Integer id);

    public void saveExperiencia(Experiencia exp);

    public void deleteExperiencia(Integer id);

    // public Educacion findEducacion(Integer id);
}
