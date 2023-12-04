package Mi_Web_Backend.Service;

import Mi_Web_Backend.Entitys.Persona;

import java.util.List;

import Mi_Web_Backend.Service.Interfaces.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService implements iPersonaService {

    @Autowired
    public Mi_Web_Backend.Repository.iPersonaRepository iPersonaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> getPersonas() {
        return iPersonaRepository.findAll();
    }

    @Override
    @Transactional
    public void savePersona(Persona per) {
        iPersonaRepository.save(per);
    }

    @Override
    @Transactional
    public void deletePersona(Integer id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findPersona(Integer id) {
        return iPersonaRepository.findById(id).orElse(null);
    }

}
