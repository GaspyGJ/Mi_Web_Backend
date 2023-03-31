package com.Mi_Web_Backend.Entitys;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter// agrega los get y set
@Entity
@Table(name = "educacion")
public class Educacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEducacion")
    private Integer idEducacion;

    @Column(name = "titulo", nullable = false, length = 30)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "anioStart", nullable = false, length = 4)
    private String anioStart;
    
    @Column(name = "anioEnd", nullable = false, length = 4)
    private String anioEnd;

    @Column(name = "estadoActual", nullable = false, length = 45)
    private String estadoActual;
    
    /*@Column(name = "Persona_idPersona", nullable = false)
    private Integer Persona_idPersona; //FK PK*/

    public Educacion() {
    }

    public Educacion(Integer id, String titulo, String descripcion, String anioStart,
            String anioEnd, Integer Persona_idPersona) {
        this.idEducacion = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anioStart = anioStart;
        this.anioEnd = anioEnd;
    }

}
