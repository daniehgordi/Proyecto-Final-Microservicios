package com.curso.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * @author Daniel Gordillo Guillen
 * @version 1.0
 *
 * Clase que representa un vuelo.
 */
@Entity
@Table(name="vuelos")
public class Vuelo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_vuelo")
    private int idVuelo;
    private String compania;
    @Column(name="fecha_vuelo")
    private Date fechaVuelo;
    private double precio;
    @Column(name="plazas_disponibles")
    private int plazasDisponibles;

    /**
     * Constructor por defecto de la clase Vuelo.
     */
    public Vuelo() {
        super();
    }

    /**
     * Constructor de la clase Vuelo.
     *
     * @param compania Compañía del vuelo
     * @param fechaVuelo Fecha del vuelo
     * @param precio Precio del vuelo
     * @param plazasDisponibles Número de plazas disponibles en el vuelo
     */
    public Vuelo(String compania, Date fechaVuelo, double precio, int plazasDisponibles) {
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
     * @param idVuelo ID del vuelo a establecer
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
     * @param compania Compañía del vuelo a establecer
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
     * @param fechaVuelo Fecha del vuelo a establecer
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
     * @param precio Precio del vuelo a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Obtiene el número de plazas disponibles en el vuelo.
     *
     * @return Número de plazas disponibles en el vuelo
     */
    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    /**
     * Establece el número de plazas disponibles en el vuelo.
     *
     * @param plazasDisponibles Número de plazas disponibles en el vuelo a establecer
     */
    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }
	
	

}
