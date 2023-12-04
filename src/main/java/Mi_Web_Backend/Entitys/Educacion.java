package Mi_Web_Backend.Entitys;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "educacion")
public class Educacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero_orden")
    private Integer numeroOrden;

    @Column(name = "titulo", nullable = false, length = 30)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "anio_inicio", nullable = false, length = 4)
    private String anioInicio;
    
    @Column(name = "anio_fin", nullable = false, length = 4)
    private String anioFin;

    @Column(name = "estado", nullable = false, length = 45)
    private String estado;

    //es un PDF
    @Lob
    @Column(name = "certificado", nullable = true)
    byte[] certificado;

    public Educacion() {
    }

}
