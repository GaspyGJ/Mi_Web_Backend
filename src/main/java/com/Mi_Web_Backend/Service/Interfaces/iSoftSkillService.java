package com.Mi_Web_Backend.Service.Interfaces;

import com.Mi_Web_Backend.Entitys.SoftSkill;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iSoftSkillService {

    public List<SoftSkill> getSoftSkills();

    public void saveSoftSkill(SoftSkill exp);
    
    public Optional<SoftSkill>  getSoftSkillByID(Integer id);

    public void deleteSoftSkill(Integer id);

    // public Educacion findEducacion(Integer id);
}
