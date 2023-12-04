package Mi_Web_Backend.Controller;

import Mi_Web_Backend.Util.Path;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = Path.crossOrigin)
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> isRunnning() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"message\": \" servidor corriendo :) \"}");
    }

}
