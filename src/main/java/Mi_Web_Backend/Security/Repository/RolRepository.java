package Mi_Web_Backend.Security.Repository;

import Mi_Web_Backend.Security.Entity.Rol;
import Mi_Web_Backend.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
  Optional<Rol> findByRolNombre(RolNombre nombre);
}