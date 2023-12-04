package Mi_Web_Backend.Service;

import Mi_Web_Backend.Entitys.Experiencia;
import Mi_Web_Backend.Service.Interfaces.iExperienciaService;
import Mi_Web_Backend.Repository.iExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaService implements iExperienciaService {

    @Autowired
    public iExperienciaRepository iExperienciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Experiencia> getExperiencias() {
        return iExperienciaRepository.findAll();
    }

    @Override
    public Optional<Experiencia> getExperienciaByID(Integer id) {
        return  iExperienciaRepository.findById(id);
    }

    @Override
    @Transactional
    public void saveExperiencia(Experiencia exp) {
        iExperienciaRepository.save(exp);
    }

    @Override
    @Transactional
    public void deleteExperiencia(Integer id) {
        iExperienciaRepository.deleteById(id);
    }
}
