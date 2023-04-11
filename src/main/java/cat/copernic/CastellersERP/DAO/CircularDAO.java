/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.CastellersERP.DAO;

import cat.copernic.CastellersERP.model.Circular;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pablogomez La interfaz CircularDAO define un repositorio de acceso a
 * datos que maneja objetos de tipo Circular. Extiende CrudRepository, lo que
 * proporciona métodos CRUD (crear, leer, actualizar y eliminar) para Circular
 * sin necesidad de implementarlos manualmente.
 * @see org.springframework.data.repository.CrudRepository
 * @author pablogomez
 * @param <Circular> la clase que define la entidad con la que trabajaremos
 * @param <Integer> el tipo del atributo que define la clave primaria de esta
 * entidad
 */
public interface CircularDAO extends CrudRepository<Circular, Integer> {

}
