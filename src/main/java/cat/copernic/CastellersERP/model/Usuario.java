/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.model;


import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Taufik
 */

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    //Identificació de la classe per poder deserialitzar de manera correcta
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement
    @Column(name = "idusuario", nullable = false, unique = true)
    private int idusuario;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "edat", nullable = false)
    private Date edat;
    @Column(name = "mail", nullable = false)
    private String mail;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "peso", nullable = false)
    private float peso;
    @Column(name = "altura", nullable = false)
    private float altura;
    @Column(name = "activo", nullable = false)
    private boolean activo;
    @Column(name = "posicio", nullable = false)
    private String posicion;
    @Column(name = "tipousuario_idtipousuario", nullable = false)
    private int tipousuario_idtipousuario;
    
    
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "usuariosAsignados")
    private List<Evento> eventos = new ArrayList<>();
    
    
    
}