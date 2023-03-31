
package com.Mi_Web_Backend.Service;

import com.Mi_Web_Backend.Entitys.SoftSkill;
import com.Mi_Web_Backend.Service.Interfaces.iSoftSkillService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements iSoftSkillService {
        @Autowired
    public com.Mi_Web_Backend.repository.iSoftSkillRepository iSoftSkillRepository;
    
    @Override
    public List<SoftSkill> getSoftSkills() {
       return  iSoftSkillRepository.findAll();
    }

    @Override
    public void saveSoftSkill(SoftSkill hs) {
        iSoftSkillRepository.save(hs);
    }

    @Override
    public void deleteSoftSkill(Integer id) {
        iSoftSkillRepository.deleteById(id);
    }

    @Override
    public Optional<SoftSkill> getSoftSkillByID(Integer id) {
            return  iSoftSkillRepository.findById(id);
    }
    
}
