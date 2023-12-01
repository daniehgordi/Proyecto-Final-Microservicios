package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 */
public interface ReservaService {
	void crearReserva(Reserva reserva);
	List<Reserva> dameLista();
	List<Reserva> reservasExistentes(String nombreHotel);

}
