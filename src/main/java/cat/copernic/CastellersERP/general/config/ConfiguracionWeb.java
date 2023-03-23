/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.general.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Taufik
 */

@Configuration
public class ConfiguracionWeb implements WebMvcConfigurer {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registre) {
        //registre.addViewController("/").setViewName("index"); //Mostrem la pàgina incial que reanomenen com a index, quan encara no ens hem autenticat
        registre.addViewController("/Login"); //Mostrem la pàgina login quan l'usuari no ha pogut autenticar-se
        registre.addViewController("/errors/error403").setViewName("/errors/error403"); //Mostrem la pàgina error403 quan l'usuari no pot accedir a una pàgina determinada.
    }
}