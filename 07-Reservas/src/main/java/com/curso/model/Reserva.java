package com.curso.model;

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
 * Clase que representa una reserva.
 */
@Entity
@Table(name="reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_reserva")
    private int idReserva;
    private String nombre;
    private String dni;
    @Column(name="id_hotel")
    private int idHotel;
    @Column(name="id_vuelo")
    private int idVuelo;
    @Column(name="personas")
    private int numeroPersonas;

    /**
     * Constructor sin argumentos de Reserva.
     */
    public Reserva() {
        super();
    }

    /**
     * Constructor de Reserva con parámetros.
     *
     * @param nombre Nombre del titular de la reserva
     * @param dni DNI del titular de la reserva
     * @param idHotel ID del hotel de la reserva
     * @param idVuelo ID del vuelo de la reserva
     * @param numeroPersonas Número de personas de la reserva
     */
    public Reserva(String nombre, String dni, int idHotel, int idVuelo, int numeroPersonas) {
        super();
        this.nombre = nombre;
        this.dni = dni;
        this.idHotel = idHotel;
        this.idVuelo = idVuelo;
        this.numeroPersonas = numeroPersonas;
    }

    /**
     * Obtiene el ID de la reserva.
     *
     * @return ID de la reserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * Establece el ID de la reserva.
     *
     * @param idReserva ID de la reserva
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * Obtiene el nombre del titular de la reserva.
     *
     * @return Nombre del titular de la reserva
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la reserva.
     *
     * @param nombre Nombre del titular de la reserva
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del titular de la reserva.
     *
     * @return DNI del titular de la reserva
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del titular de la reserva.
     *
     * @param dni DNI del titular de la reserva
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el ID del hotel de la reserva.
     *
     * @return ID del hotel de la reserva
     */
    public int getIdHotel() {
        return idHotel;
    }

    /**
     * Establece el ID del hotel de la reserva.
     *
     * @param idHotel ID del hotel de la reserva
     */
    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    /**
     * Obtiene el ID del vuelo de la reserva.
     *
     * @return ID del vuelo de la reserva
     */
    public int getIdVuelo() {
        return idVuelo;
    }
	/**
	 * Establece el ID del vuelo de la reserva.
	 *
	 * @param idVuelo ID del vuelo de la reserva
	 */
	public void setIdVuelo(int idVuelo) {
	    this.idVuelo = idVuelo;
	}

	/**
	 * Obtiene el número de personas de la reserva.
	 *
	 * @return Número de personas de la reserva
	 */
	public int getNumeroPersonas() {
	    return numeroPersonas;
	}

	/**
	 * Establece el número de personas de la reserva.
	 *
	 * @param numeroPersonas Número de personas de la reserva
	 */
	public void setNumeroPersonas(int numeroPersonas) {
	    this.numeroPersonas = numeroPersonas;
	}
	
	

}
