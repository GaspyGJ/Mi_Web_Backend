package com.Mi_Web_Backend.Entitys;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter// agrega los get y set
@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idExperiencia")
    private Integer idExperiencia;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;
    
    @Column(name = "tipoExperiencia", nullable = false, length = 30)
    private String tipoExperiencia;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "tegnologiasUtilizadas", nullable = false)
    private String tegnologiasUtilizadas;
    
    @Column(name = "anioStart", nullable = false, length = 4)
    private String anioStart;
    
    @Column(name = "anioEnd", length = 10)
    private String anioEnd;

    @Column(name = "linkProyectos" , length = 255)
    private String linkProyectos;

    public Experiencia() {}
    
    
}
