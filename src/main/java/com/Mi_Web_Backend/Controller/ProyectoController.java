
package com.Mi_Web_Backend.Controller;

import com.Mi_Web_Backend.Entitys.Proyecto;
import com.Mi_Web_Backend.Util.Path;
import com.Mi_Web_Backend.Service.Interfaces.iProyectoService;
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
public class ProyectoController {

    @Autowired
    private iProyectoService iProyectoService;

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar/proyecto")
    public void agregar_actualizar_Proyecto(@RequestBody Proyecto p) {
        iProyectoService.saveProyecto(p);
    }

    @GetMapping("/get/proyectos")
    @ResponseBody
    public Iterable<Proyecto> getProyectos() {
        return iProyectoService.getProyectos();
    }
    
    @GetMapping("/get/proyecto/{id}")
    public Optional<Proyecto> getProyecto(@PathVariable Integer id) {
        return iProyectoService.getProyectoByID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Integer id) {
        iProyectoService.deleteProyecto(id);
    }

}