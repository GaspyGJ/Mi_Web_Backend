package Mi_Web_Backend.Security;

import Mi_Web_Backend.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * ESTA CLASE SOLO SE EJECUTARA UNA VEZ PARA CREAR LOS ROLES.
 * UNA VEZ CREADOS SE DEBERA ELIMINAR O BIEN COMENTAR EL CODIGO
 **/

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
         /**
          Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
          Rol rolUser = new Rol(RolNombre.ROLE_USER);
          rolService.save(rolAdmin);
          rolService.save(rolUser);
         **/
    }
}