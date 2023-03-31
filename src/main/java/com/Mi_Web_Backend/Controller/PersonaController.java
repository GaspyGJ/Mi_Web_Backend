package com.Mi_Web_Backend.Controller;

import com.Mi_Web_Backend.Entitys.Persona;
import com.Mi_Web_Backend.Util.Path;
import com.Mi_Web_Backend.Service.Interfaces.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = Path.PATH)// para q acepte peticiones desde esa ruta
public class PersonaController {
  
    @Autowired
    private iPersonaService iPersonaService;

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar/persona")
    public  void agregarPersona(@RequestBody Persona p){
        iPersonaService.savePersona(p);
    }

    @GetMapping("/get/personas")
    public Iterable<Persona> verPersonas() {
        return iPersonaService.getPersonas();
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersonas(@PathVariable Integer id) {
        iPersonaService.deletePersona(id);
    }
    
}
