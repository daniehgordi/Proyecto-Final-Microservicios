package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;
/**
 * Creamos la interfaz para poder utilizar JpaRepository
 * 
 * @author Daniel Gordillo Guillen
 * @version 1.0
 */
public interface DaoHotel extends JpaRepository<Hotel, Integer> {

}
