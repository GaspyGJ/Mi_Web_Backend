
package Mi_Web_Backend.Service;

import Mi_Web_Backend.Entitys.Proyecto;
import Mi_Web_Backend.Service.Interfaces.iProyectoService;
import Mi_Web_Backend.Repository.iProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements iProyectoService {

    @Autowired
    public iProyectosRepository iProyectoRepository;
    
    @Override
    public List<Proyecto> getProyectos() {
           return iProyectoRepository.findAll();
    }

    @Override
    public Optional<Proyecto> getProyectoByID(Integer id){
        return iProyectoRepository.findById(id);
        }

    @Override
    public void saveProyecto(Proyecto p) {
        iProyectoRepository.save(p);
        }

    @Override
    public void deleteProyecto(Integer id) {
        iProyectoRepository.deleteById(id);
        }
    
}
