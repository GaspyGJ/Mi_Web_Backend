
package Mi_Web_Backend.Entitys;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter// agrega los get y set
@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero_orden")
    private Integer numeroOrden;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "gitHub_web")
    private String gitHubWeb;
    
    @Column(name = "direccion_web")
    private String direccionWeb;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ImagenProyecto> imagenes;

    public Proyecto() {}
}
