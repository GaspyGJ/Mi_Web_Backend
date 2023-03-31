package com.Mi_Web_Backend.Service.Interfaces;

import com.Mi_Web_Backend.Entitys.HardSkill;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iHardSkillService {

    public List<HardSkill> getHardSkills();
    
    public Optional<HardSkill>  getHardSkillByID(Integer id);

    public void saveHardSkill(HardSkill exp);

    public void deleteHardSkill(Integer id);

    // public Educacion findEducacion(Integer id);
}
