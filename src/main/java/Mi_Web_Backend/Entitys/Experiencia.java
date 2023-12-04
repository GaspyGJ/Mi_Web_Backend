package Mi_Web_Backend.Entitys;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero_orden")
    private Integer numeroOrden;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "tegnologias_utilizadas", nullable = false)
    private String tegnologiasUtilizadas;
    
    @Column(name = "tipoExperiencia", nullable = false, length = 30)
    private String tipoExperiencia;
    
    @Column(name = "anio_inicio", nullable = false, length = 4)
    private String anioInicio;
    
    @Column(name = "anio_fin", nullable = false, length = 10)
    private String anioFin;

    @Column(name = "link")
    private String link;

    public Experiencia() {}

}
