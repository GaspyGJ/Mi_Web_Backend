
package Mi_Web_Backend.Repository;

import Mi_Web_Backend.Entitys.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iEducacionRepository extends JpaRepository<Educacion,Integer>{
    //JpaRepository tiene todas los metodos necesarios para hacer CRUD en la bbdd
}
