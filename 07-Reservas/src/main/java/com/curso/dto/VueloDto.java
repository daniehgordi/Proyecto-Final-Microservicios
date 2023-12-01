package com.curso.dto;

import java.util.Date;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 * 
 * Clase intermedia utilizada para transferir datos de vuelos.
 */
public class VueloDto {
    private int idVuelo;
    private String compania;
    private Date fechaVuelo;
    private double precio;
    private int plazasDisponibles;

    /**
     * Constructor sin argumentos de VueloDto.
     */
    public VueloDto() {
        super();
    }

    /**
     * Constructor de VueloDto con parámetros.
     *
     * @param compania Compañía del vuelo
     * @param fechaVuelo Fecha del vuelo
     * @param precio Precio del vuelo
     * @param plazasDisponibles Plazas disponibles en el vuelo
     */
    public VueloDto(String compania, Date fechaVuelo, double precio, int plazasDisponibles) {
        super();
        this.compania = compania;
        this.fechaVuelo = fechaVuelo;
        this.precio = precio;
        this.plazasDisponibles = plazasDisponibles;
    }

    /**
     * Obtiene el ID del vuelo.
     *
     * @return ID del vuelo
     */
    public int getIdVuelo() {
        return idVuelo;
    }

    /**
     * Establece el ID del vuelo.
     *
     * @param idVuelo ID del vuelo
     */
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    /**
     * Obtiene la compañía del vuelo.
     *
     * @return Compañía del vuelo
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Establece la compañía del vuelo.
     *
     * @param compania Compañía del vuelo
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * Obtiene la fecha del vuelo.
     *
     * @return Fecha del vuelo
     */
    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    /**
     * Establece la fecha del vuelo.
     *
     * @param fechaVuelo Fecha del vuelo
     */
    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    /**
     * Obtiene el precio del vuelo.
     *
     * @return Precio del vuelo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vuelo.
     *
     * @param precio Precio del vuelo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el número de plazas disponibles en el vuelo.
     *
     * @return Número de plazas disponibles
     */
    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    /**
     * Establece el número de plazas disponibles en el vuelo.
     *
     * @param plazasDisponibles Número de plazas disponibles
     */
    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }
}
