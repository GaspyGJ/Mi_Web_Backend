package com.Mi_Web_Backend.Controller;

import com.Mi_Web_Backend.Entitys.Experiencia;
import com.Mi_Web_Backend.Util.Path;
import com.Mi_Web_Backend.Service.Interfaces.iExperienciaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = Path.PATH)
public class ExperienciaController {

    @Autowired
    private iExperienciaService iExperienciaService;

   // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar/experiencia")
    public void agregar_actualizar_Experienica(@RequestBody Experiencia e) {
        iExperienciaService.saveExperiencia(e);
    }

    @GetMapping("/get/experiencias")
    @ResponseBody
    public Iterable<Experiencia> getExperiencias() {
        return iExperienciaService.getExperiencias();
    }
    
    @GetMapping("/get/experiencia/{id}")
    public Optional<Experiencia> getHardExperiencia(@PathVariable Integer id) {
        return iExperienciaService.getHardSkillByID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Integer id) {
        iExperienciaService.deleteExperiencia(id);
    }

}
