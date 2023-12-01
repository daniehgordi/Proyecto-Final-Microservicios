package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VueloDao;
import com.curso.model.Vuelo;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 *
 * Implementación de la interfaz VueloService.
 */
@Service
public class VueloServiceImplement implements VueloService {
    @Autowired
    VueloDao dao;

    /**
     * Obtiene una lista de vuelos disponibles dado el número de plazas a reservar.
     *
     * @param plazasAReservar Número de plazas a reservar
     * @return Lista de vuelos disponibles
     */
    @Override
    public List<Vuelo> vuelosDisponibles(int plazasAReservar) {
        List<Vuelo> listaVuelos = dao.findAll();
        List<Vuelo> vuelosDisponibles = new ArrayList<>();
        for(Vuelo vuelo:listaVuelos) {
            if(vuelo.getPlazasDisponibles() >= plazasAReservar) {
                vuelosDisponibles.add(vuelo);
            }
        }
        return vuelosDisponibles;
    }

    /**
     * Actualiza el número de plazas disponibles de un vuelo.
     *
     * @param idVuelo ID del vuelo a actualizar
     * @param actualizacionPlazas Número de plazas a actualizar
     */
    @Override
    public void actualizarVuelo(int idVuelo, int actualizacionPlazas) {
        Vuelo vuelo = dao.findById(idVuelo).orElse(null);
        if(vuelo != null) {
            vuelo.setPlazasDisponibles(actualizacionPlazas);
            dao.save(vuelo);
        }
    }
    
    /**
     * Obtiene una lista de todos los vuelos.
     *
     * @return Lista de vuelos
     */
    @Override
    public List<Vuelo> listaVuelos(){
        return dao.findAll();
    }
    
    /**
     * Crea un nuevo vuelo.
     *
     * @param vuelo Vuelo a crear
     */
    @Override
    public void crearVuelo(Vuelo vuelo){
        dao.save(vuelo);
    }
}