package Mi_Web_Backend.Entitys;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="imagen_proyecto")
public class ImagenProyecto  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "proyecto_id", referencedColumnName = "id")
    private Proyecto proyecto;

    @Lob
    @Column(name="archivo")
    private byte[] archivo;

    @Column(name="tipo")
    private String tipo;

    ImagenProyecto(){}
}
