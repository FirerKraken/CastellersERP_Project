/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.gestionEconomica.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author pablogomez
 */
public class ControladorAnadirApunte {
    
    @GetMapping("/AnadirApunte")
    public String inicio(Model model){ 
        
        return "gestionEconomica/AnadirApunte"; 
    }
    
}
