/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.general.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author pablogomez
 */

@Controller
public class ControladorModificarCircular {
    
    @GetMapping("/ModificarCircular")
    public String inicio(Model model){ 
        
        return "general/ModificarCircular"; 
    }
    
}
