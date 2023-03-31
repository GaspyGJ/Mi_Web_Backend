
package com.Mi_Web_Backend.Service;

import com.Mi_Web_Backend.Entitys.HardSkill;
import com.Mi_Web_Backend.Service.Interfaces.iHardSkillService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements iHardSkillService {

    @Autowired
    public com.Mi_Web_Backend.repository.iHardSkillRepository iHardSkillRepository;
    
    @Override
    public List<HardSkill> getHardSkills() {
       return  iHardSkillRepository.findAll();
    }

    @Override
    public void saveHardSkill(HardSkill hs) {
        iHardSkillRepository.save(hs);
    }

    @Override
    public void deleteHardSkill(Integer id) {
        iHardSkillRepository.deleteById(id);
    }

    @Override
    public Optional<HardSkill> getHardSkillByID(Integer id) {
      return  iHardSkillRepository.findById(id);
      
    }
    
}
