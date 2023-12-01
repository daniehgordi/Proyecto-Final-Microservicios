package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Reserva;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 */
public interface ReservaDao extends JpaRepository<Reserva, Integer> {
	
	List<Reserva> findByIdHotel(int idHotel);
}
