
package Mi_Web_Backend.Service;

import Mi_Web_Backend.Entitys.SkillSoft;
import Mi_Web_Backend.Service.Interfaces.iSoftSkillService;
import Mi_Web_Backend.Repository.iSoftSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements iSoftSkillService {
        @Autowired
    public iSoftSkillRepository iSoftSkillRepository;
    
    @Override
    public List<SkillSoft> getSoftSkills() {
       return  iSoftSkillRepository.findAll();
    }

    @Override
    public void saveSoftSkill(SkillSoft hs) {
        iSoftSkillRepository.save(hs);
    }

    @Override
    public void deleteSoftSkill(Integer id) {
        iSoftSkillRepository.deleteById(id);
    }

    @Override
    public Optional<SkillSoft> getSoftSkillByID(Integer id) {
            return  iSoftSkillRepository.findById(id);
    }
    
}
