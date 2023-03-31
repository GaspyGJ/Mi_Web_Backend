
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
@Table(name = "proyecto")
public class Proyecto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProyecto")
    private Integer idProyecto;
    
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "urlGitHub", nullable = true,length = 255)
    private String urlGitHub;
    
    @Column(name = "urlAppWeb", nullable = true,length = 255)
    private String urlAppWeb;
    
    @Column(name = "urlFotosProyecto", nullable = false)
    private String urlFotos[];
    

    public Proyecto() {}
}
