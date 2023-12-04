package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Entitys.SkillSoft;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Service.Interfaces.iSoftSkillService;
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
public class SoftSkillController {

    @Autowired
    private iSoftSkillService iSoftSkillService;

    @PostMapping("/guardar/soft/skill")
    public ResponseEntity<String> agregar_actualizar_SoftSkill(@RequestBody SkillSoft ss){
        try{
            iSoftSkillService.saveSoftSkill(ss);
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

    @GetMapping("/get/soft/skills")
    public ResponseEntity<List<SkillSoft>> getSoftSkills() {
        List<SkillSoft> softSkills = iSoftSkillService.getSoftSkills();
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(softSkills);
    }

    @GetMapping("/get/soft/skill/{id}")
    public ResponseEntity<SkillSoft> getSoftSkill(@PathVariable Integer id) {
        Optional<SkillSoft> softSkill = iSoftSkillService.getSoftSkillByID(id);
        if (softSkill.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(softSkill.get());
    }

    @DeleteMapping("/delete/soft/skill/{id}")
    public ResponseEntity<String> borrarSoftSkill(@PathVariable Integer id) {
        try{
            iSoftSkillService.deleteSoftSkill(id);
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
