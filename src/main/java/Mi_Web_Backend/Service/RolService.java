package Mi_Web_Backend.Service;

import Mi_Web_Backend.Security.Entity.Rol;
import Mi_Web_Backend.Security.Enums.RolNombre;
import Mi_Web_Backend.Security.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre nombre){
        return rolRepository.findByRolNombre(nombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
