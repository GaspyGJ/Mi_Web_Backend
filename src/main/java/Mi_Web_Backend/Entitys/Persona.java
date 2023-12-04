
package Mi_Web_Backend.Entitys;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.BlobType;


@Getter @Setter// agrega los get y set
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable=false , length=45)
    private String nombre;

    @Column(name = "apellido", nullable=false, length=45)
    private String apellido;
    
    @Column(name = "edad", nullable=false)
    private int edad;

    @Column(name = "domicilio", nullable=false,length=100)
    private String domicilio;

    @Column(name = "titulo" , length=45)
    private String titulo;

    @Lob
    @Column(name = "icon")
    byte[] foto;
    
    @Column(name = "descripcion",length=100)
    private String descripcion;
    
    public Persona(){}
    
    public Persona(String nombre,String apellido,int edad,
            String domicilio,String titulo,byte[] foto,String descripcion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.domicilio=domicilio;
        this.titulo=titulo;
        this.foto=foto;
        this.descripcion=descripcion;
    }   
    
}

