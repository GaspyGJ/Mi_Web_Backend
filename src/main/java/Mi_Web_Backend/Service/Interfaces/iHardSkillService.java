package Mi_Web_Backend.Service.Interfaces;

import Mi_Web_Backend.Entitys.SkillHard;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iHardSkillService {

    public List<SkillHard> getHardSkills();
    
    public Optional<SkillHard>  getHardSkillByID(Integer id);

    public void saveHardSkill(SkillHard exp);

    public void deleteHardSkill(Integer id);

    // public Educacion findEducacion(Integer id);
}
