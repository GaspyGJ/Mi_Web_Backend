package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Entitys.Educacion;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Service.Interfaces.iEducacionService;
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
public class EducacionController {

    @Autowired
    private iEducacionService iEducacionService;

    @PostMapping("/guardar/educacion")
    public ResponseEntity<String> agregar_actualizar_Educacion(@RequestBody Educacion e) {
        try{
            iEducacionService.saveEducacion(e);
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

    @GetMapping("/get/educaciones")
    public ResponseEntity<List<Educacion>> obtenerEducaciones() {
            List<Educacion> educaciones = iEducacionService.getEducaciones();
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(educaciones);
    }

    @GetMapping("/get/educacion/{id}")
    public ResponseEntity<Educacion> getEducacion(@PathVariable Integer id) {
        Optional<Educacion> educacion = iEducacionService.getEducacionById(id);
        if (educacion.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(educacion.get());
    }

    @DeleteMapping("/delete/educacion/{id}")
    public ResponseEntity<String>  borrarEducacion(@PathVariable Integer id) {
        try{
            iEducacionService.deleteEducacion(id);
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