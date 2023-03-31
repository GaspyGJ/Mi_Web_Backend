
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
@Table(name = "SoftSkill")
public class SoftSkill implements Serializable{
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSoftSkill")
    private Integer idSoftSkill;

    @Column(name = "porcentaje", nullable = false)
    private Integer porcentaje;
    
    @Column(name = "titulo", nullable = false, length = 30)
    private String titulo;
    
    @Column(name = "fontSize", nullable = false,length = 2)
    private String fontSize;

    public SoftSkill() {}
    
}