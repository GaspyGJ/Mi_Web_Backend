
package Mi_Web_Backend.Service;

import Mi_Web_Backend.Entitys.SkillHard;
import Mi_Web_Backend.Service.Interfaces.iHardSkillService;
import Mi_Web_Backend.Repository.iHardSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements iHardSkillService {

    @Autowired
    public iHardSkillRepository iHardSkillRepository;
    
    @Override
    public List<SkillHard> getHardSkills() {
       return  iHardSkillRepository.findAll();
    }

    @Override
    public void saveHardSkill(SkillHard hs) {
        iHardSkillRepository.save(hs);
    }

    @Override
    public void deleteHardSkill(Integer id) {
        iHardSkillRepository.deleteById(id);
    }

    @Override
    public Optional<SkillHard> getHardSkillByID(Integer id) {
      return  iHardSkillRepository.findById(id);
      
    }
    
}
