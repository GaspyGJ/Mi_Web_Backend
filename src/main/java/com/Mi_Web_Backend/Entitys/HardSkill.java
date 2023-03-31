
package com.Mi_Web_Backend.Entitys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter// agrega los get y set
@Entity
@Table(name = "HardSkill")
public class HardSkill implements Serializable{
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idHardSkill")
    private Integer idHardSkill;

    @Column(name = "porcentaje", nullable = false)
    private Integer porcentaje;
    
    @Column(name = "urlFoto", nullable = false, length = 255)
    private String urlFoto;
    
    @Column(name = "alto", nullable = false)
    private Integer alto;
    
    @Column(name = "ancho", nullable = false)
    private Integer ancho;


    public HardSkill() {}
    
}
