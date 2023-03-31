
package com.Mi_Web_Backend.Controller;

import com.Mi_Web_Backend.Entitys.Educacion;
import com.Mi_Web_Backend.Util.Path;
import com.Mi_Web_Backend.Service.Interfaces.iEducacionService;
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
@CrossOrigin(origins = Path.PATH)// para q acepte peticiones desde esa ruta
public class EducacionController {

    @Autowired
    private iEducacionService iEducacionService;

    //
    @PostMapping("/guardar/educacion")
    public  void agregar_actualizar_Educacion(@RequestBody Educacion e){
        iEducacionService.saveEducacion(e);
    }


    @GetMapping("/get/educaciones")
    @ResponseBody
    public Iterable<Educacion> getEducaciones() {
        return iEducacionService.getEducaciones();
    }

    @GetMapping("/get/educacion/{id}")
    public Optional<Educacion> getEducacion(@PathVariable Integer id) {
        return iEducacionService.getHardSkillByID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Integer id) {
        iEducacionService.deleteEducacion(id);
    }

    
}
