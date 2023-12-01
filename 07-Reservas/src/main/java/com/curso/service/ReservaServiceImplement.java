package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.dto.HotelDto;
import com.curso.dto.VueloDto;
import com.curso.model.Reserva;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 *
 * Implementación de la interfaz ReservaService.
 */
@Service
public class ReservaServiceImplement implements ReservaService{
    @Autowired
    ReservaDao dao;

    @Autowired
    private RestTemplate template;

    private String urlHoteles = "http://localhost:8080/";
    private String urlVuelos = "http://localhost:9000/";

    /**
     * Crea una reserva.
     *
     * @param reserva Reserva a crear
     */
    public void crearReserva(Reserva reserva) {
        List<VueloDto> listaVuelos = Arrays.asList(template.getForObject(urlVuelos + "vuelos", VueloDto[].class));
        for(VueloDto vuelo:listaVuelos) {
            if(vuelo.getIdVuelo() == reserva.getIdVuelo() && reserva.getNumeroPersonas()>0 && vuelo.getPlazasDisponibles()>=reserva.getNumeroPersonas()) {
                int actualizacionDisponibilidad = vuelo.getPlazasDisponibles() - reserva.getNumeroPersonas();
                vuelo.setPlazasDisponibles(actualizacionDisponibilidad);
                template.put(urlVuelos + "vuelos/{idVuelo}?actualizacionPlazas={actualizacionPlazas}", null, vuelo.getIdVuelo(), actualizacionDisponibilidad);
                dao.save(reserva);
            }
        }
    }

    /**
     * Obtiene todas las reservas existentes en un hotel.
     *
     * @param nombreHotel Nombre del hotel
     * @return Lista de reservas existentes en el hotel
     */
    public List<Reserva> reservasExistentes(String nombreHotel){
        int hotelId=0;
        List<HotelDto> hoteles = Arrays.asList(template.getForObject(urlHoteles + "hoteles", HotelDto[].class));
        for(HotelDto hotel:hoteles) {
            if(hotel.getNombreHotel().equals(nombreHotel)){
                hotelId = hotel.getIdHotel();
            }
        }
        List<Reserva> listaReservas = dao.findByIdHotel(hotelId);
        return listaReservas;
    }

    /**
     * Obtiene todas las reservas existentes.
     *
     * @return Lista de todas las reservas existentes
     */
    public List<Reserva> dameLista(){
        return dao.findAll();
    }
}