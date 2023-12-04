package Mi_Web_Backend.Service.Interfaces;

import Mi_Web_Backend.Entitys.SkillSoft;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iSoftSkillService {

    public List<SkillSoft> getSoftSkills();

    public void saveSoftSkill(SkillSoft exp);
    
    public Optional<SkillSoft>  getSoftSkillByID(Integer id);

    public void deleteSoftSkill(Integer id);

    // public Educacion findEducacion(Integer id);
}
