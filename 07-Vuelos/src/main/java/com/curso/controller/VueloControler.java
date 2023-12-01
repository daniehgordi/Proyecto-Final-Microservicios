package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VueloService;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 *
 * Controlador para los vuelos.
 */
@RestController
public class VueloControler {
    @Autowired
    VueloService service;

    /**
     * Obtiene la lista de vuelos disponibles.
     *
     * @param plazasAReservar Número de plazas a reservar
     * @return Lista de vuelos disponibles
     */
    //http://localhost:9090/vuelos/20
    @GetMapping(value="/vuelos/{plazasAReservar}", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelo> listaVuelosDisponibles(@PathVariable("plazasAReservar") int plazasAReservar) {
        return service.vuelosDisponibles(plazasAReservar);
    }

    /**
     * Actualiza el número de plazas disponibles de un vuelo.
     *
     * @param idVuelo ID del vuelo a actualizar
     * @param actualizacionPlazas Número de plazas a actualizar
     */
    //http://localhost:9090/vuelos/2?50
    @PutMapping(value="/vuelos/{idVuelo}", produces=MediaType.APPLICATION_JSON_VALUE)
    public void actualizarVuelos(@PathVariable("idVuelo") int idVuelo,
        @RequestParam("actualizacionPlazas") int actualizacionPlazas) {
        service.actualizarVuelo(idVuelo, actualizacionPlazas);
    }

    /**
     * Obtiene la lista de todos los vuelos.
     *
     * @return Lista de todos los vuelos
     */
    //http://localhost:9090/vuelos
    @GetMapping(value="/vuelos", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelo> listadoVuelos() {
        return service.listaVuelos();
    }

    /**
     * Crea un nuevo vuelo.
     *
     * @param vuelo Vuelo a crear
     */
    @PostMapping(value="/vuelos", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void nuevaRuta(@RequestBody Vuelo vuelo) {
        service.crearVuelo(vuelo);
    }
}