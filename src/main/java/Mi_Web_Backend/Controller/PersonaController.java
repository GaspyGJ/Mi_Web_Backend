package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Entitys.Persona;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Service.Interfaces.iPersonaService;
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

@RestController
@CrossOrigin(origins = Path.crossOrigin)
public class PersonaController {
    //CREO Q ESTE CONTROLLER NO SE UTILIZA.
    //Para usuarios se utiliza el Security/AuthController
    @Autowired
    private iPersonaService iPersonaService;

    @PostMapping("/guardar/persona")
    public void agregarPersona(@RequestBody Persona p) {
        iPersonaService.savePersona(p);
    }

    @GetMapping("/get/personas")
    public ResponseEntity<List<Persona>> verPersonas() {
        List<Persona> personas = iPersonaService.getPersonas();
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(personas);
    }

    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Integer id) {
        iPersonaService.deletePersona(id);
    }
}
