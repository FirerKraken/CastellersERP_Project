/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.general.serveis;

import cat.copernic.CastellersERP.model.Evento;
import cat.copernic.CastellersERP.model.Usuario;
import cat.copernic.CastellersERP.model.UsuarioEvento;
import java.util.List;

/**
 *
 * @author Taufik
 */
public interface UsuarioEventoServiceInterface {
    
    public List<UsuarioEvento> llistarUsuariosEventos();//Mètode que implementarem per llistar usuarios
    
    public void afegirUsuarioEvento(UsuarioEvento usuarioevento); //Mètode que implementarem per afegir un usuario
    
    public void eliminarUsuarioEvento(UsuarioEvento usuarioevento); //Mètode que implementarem per eliminar un usuario
    
    public UsuarioEvento cercarUsuarioEvento(UsuarioEvento usuarioevento); //Mètode que implementarem per cercar un usuario
    
    //public UsuarioEvento buscarUsuarioEventoPorUsuarioYEvento(Usuario usuario, Evento evento);

    public Integer obtenerIdUsuarioEvento(int idUsuario, int idEvento);
    
    
}