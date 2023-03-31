package com.Mi_Web_Backend.Controller;

import com.Mi_Web_Backend.Entitys.HardSkill;
import com.Mi_Web_Backend.Util.Path;
import com.Mi_Web_Backend.Service.Interfaces.iHardSkillService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = Path.PATH)
public class HardSkillControler {

    @Autowired
    private iHardSkillService iHardSkillService;

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/guardar/hard/skill")
    public void agregar_actualizar_Experienica(@RequestBody HardSkill e) {
        iHardSkillService.saveHardSkill(e);
    }

    @GetMapping("/get/hard/skills")
    public Iterable<HardSkill> getHardExperiencias() {
        return iHardSkillService.getHardSkills();
    }
    
    @GetMapping("/get/hard/skill/{id}")
    public Optional<HardSkill> getHardExperiencia(@PathVariable Integer id) {
        return iHardSkillService.getHardSkillByID(id);
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/hard/skill/{id}")
    public void borrarExperiencia(@PathVariable Integer id) {
        iHardSkillService.deleteHardSkill(id);
    }

}
