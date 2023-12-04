
package Mi_Web_Backend.Entitys;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SkillHard")
public class SkillHard implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "numero_orden")
    private Integer numeroOrden;


    @Lob
    @Column(name = "icon", nullable = false)
    byte[] icon;

    @Column(name = "alto_icon", nullable = false)
    private Integer altoIcon;

    @Column(name = "ancho_icon", nullable = false)
    private Integer anchoIcon;

    public SkillHard() {}
}
