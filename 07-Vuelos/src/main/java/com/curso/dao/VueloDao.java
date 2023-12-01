package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Vuelo;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 */
public interface VueloDao extends JpaRepository<Vuelo, Integer> {

}
