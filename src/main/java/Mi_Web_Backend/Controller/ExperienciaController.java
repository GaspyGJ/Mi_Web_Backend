package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Entitys.Experiencia;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Service.Interfaces.iExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpClient;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = Path.crossOrigin)
public class ExperienciaController {

    @Autowired
    private iExperienciaService iExperienciaService;

    @PostMapping("/guardar/experiencia")
    public ResponseEntity<String> agregar_actualizar_Experiencia(@RequestBody Experiencia e) {
        try{
            iExperienciaService.saveExperiencia(e);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"message\": \"Ok\"}");

        }
        catch(Exception ex){
            return ResponseEntity.internalServerError()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"message\": \""+ ex.getMessage()+"\"}");
        }
    }

    @GetMapping("/get/experiencias")
    public ResponseEntity<List<Experiencia>> getExperiencias() {
        List<Experiencia> experiencias = iExperienciaService.getExperiencias();
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(experiencias);
    }

    @GetMapping("/get/experiencia/{id}")
    public ResponseEntity<Experiencia> getExperiencia(@PathVariable Integer id) {
        Optional<Experiencia> experiencia = iExperienciaService.getExperienciaByID(id);
        if (experiencia.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(experiencia.get());
    }

    @DeleteMapping("/delete/experiencia/{id}")
    public ResponseEntity<String> borrarExperiencia(@PathVariable Integer id) {
        try{
            iExperienciaService.deleteExperiencia(id);
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
