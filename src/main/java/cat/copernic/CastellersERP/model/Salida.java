/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Taufik
 */

@Data
@Entity
public class Salida extends Evento implements Serializable {
    
    //Identificació de la classe per poder deserialitzar de manera correcta
    private static final long serialVersionUID = 1L;
    
    @Column(name = "asistenciatransporte")
    private boolean asistenciaTransporte;
    @Column(name = "asistenciasalida")
    private boolean asistenciaSalida;
    @Column(name = "paradita")
    private boolean paradita;
}
