package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Entitys.Proyecto;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Service.Interfaces.iProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = Path.crossOrigin)
public class ProyectoController {

    @Autowired
    private iProyectoService iProyectoService;

    @PostMapping("/guardar/proyecto")
    public ResponseEntity<String> agregar_actualizar_Proyecto(@RequestBody Proyecto p) {
        try{
            iProyectoService.saveProyecto(p);
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"message\": \"Ok\"}");
        }
        catch(Exception ex){
            return ResponseEntity.internalServerError()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"message\": \""+ ex.getMessage()+"\"}");
        }
    }

    @GetMapping("/get/proyectos")
    public ResponseEntity<List<Proyecto>> getProyectos() {
        List<Proyecto> proyectos = iProyectoService.getProyectos();
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(proyectos);
    }

    @GetMapping("/get/proyecto/{id}")
    public ResponseEntity<Proyecto> getProyecto(@PathVariable Integer id) {
        Optional<Proyecto> proyecto = iProyectoService.getProyectoByID(id);
        if (proyecto.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(proyecto.get());
    }

    @DeleteMapping("/delete/proyecto/{id}")
    public ResponseEntity<String> borrarProyecto(@PathVariable Integer id) {
        try{
            iProyectoService.deleteProyecto(id);
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"message\": \"Ok\"}");
        }
        catch(Exception ex){
            return ResponseEntity.internalServerError()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"message\": \""+ ex.getMessage()+"\"}");
        }

    }
}
