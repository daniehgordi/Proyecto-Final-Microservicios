package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 */
public interface VueloService {
	List<Vuelo> vuelosDisponibles(int plazasAReservar);
	void actualizarVuelo(int idVuelo, int actualizacionPlazas);
	List<Vuelo> listaVuelos();
	 void crearVuelo(Vuelo vuelo);
}
