package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Entitys.SkillHard;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Service.Interfaces.iHardSkillService;
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
public class HardSkillController {

    @Autowired
    private iHardSkillService iHardSkillService;

    @PostMapping("/guardar/hard/skill")
    public ResponseEntity<String> agregar_actualizar_HardSkill(@RequestBody SkillHard e) {
        try{
            iHardSkillService.saveHardSkill(e);
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

    @GetMapping("/get/hard/skills")
    public ResponseEntity<List<SkillHard>> getHardSkills() {
        List<SkillHard> softs = iHardSkillService.getHardSkills();
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(softs);
    }

    @GetMapping("/get/hard/skill/{id}")
    public ResponseEntity<SkillHard> getHardSkill(@PathVariable Integer id) {
        Optional<SkillHard> hardSkill = iHardSkillService.getHardSkillByID(id);
        if (hardSkill.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(hardSkill.get());
    }

    @DeleteMapping("/delete/hard/skill/{id}")
    public ResponseEntity<String> borrarHardSkill(@PathVariable Integer id) {
        try{
            iHardSkillService.deleteHardSkill(id);
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
