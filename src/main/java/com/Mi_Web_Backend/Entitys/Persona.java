
package com.Mi_Web_Backend.Entitys;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter// agrega los get y set
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPersona")
    private Integer id_Persona;

    @Column(name = "nombre", nullable=false , length=45)
    private String nombre;

    @Column(name = "apellido", nullable=false, length=45)
    private String apellido;
    
    @Column(name = "edad", nullable=false)
    private int edad;

    @Column(name = "domicilio", nullable=false,length=100)
    private String domicilio;

    @Column(name = "nombrePuesto" , length=45)
    private String nombrePuesto;

    @Column(name = "urlFoto", nullable=false , length=255, unique=true)
    private String urlFoto;
    
    @Column(name = "descripcion",length=100)
    private String descripcion;
   
   /* @OneToMany( mappedBy = "Persona_idPersona")
    private List< Educacion > listEducacion;*/
    
    public Persona(){}
    
    public Persona(String nombre,String apellido,int edad,
            String domicilio,String nombre_Puesto,String url_Foto,String descripcion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.domicilio=domicilio;
        this.nombrePuesto=nombre_Puesto;
        this.urlFoto=url_Foto; 
        this.descripcion=descripcion;
    }   
    
}

