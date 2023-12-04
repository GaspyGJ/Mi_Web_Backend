package Mi_Web_Backend.Service.Interfaces;

import Mi_Web_Backend.Entitys.Educacion;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface iEducacionService {

    public List<Educacion> getEducaciones();
    
    public Optional<Educacion>  getEducacionById(Integer id);

    public void saveEducacion(Educacion per);

    public void deleteEducacion(Integer id);

    // public Educacion findEducacion(Integer id);
}
