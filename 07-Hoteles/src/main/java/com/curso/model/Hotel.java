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
 * Clase que representa un hotel.
 */
@Entity
@Table(name="hoteles")
public class Hotel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_hotel")
    private int idHotel;
    @Column(name="nombre")
    private String nombreHotel;
    private String categoria;
    private int precio;
    private boolean disponible;

    /**
     * Constructor sin argumentos.
     */
    public Hotel() {
        super();
    }

    /**
     * Constructor con argumentos.
     *
     * @param nombreHotel Nombre del hotel
     * @param categoria Categoría del hotel
     * @param precio Precio del hotel
     * @param disponible Disponibilidad del hotel
     */
    public Hotel(String nombreHotel, String categoria, int precio, boolean disponible) {
        super();
        this.nombreHotel = nombreHotel;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    /**
     * Obtiene el ID del hotel.
     *
     * @return ID del hotel
     */
    public int getIdHotel() {
        return idHotel;
    }

    /**
     * Establece el ID del hotel.
     *
     * @param idHotel ID del hotel
     */
    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    /**
     * Obtiene el nombre del hotel.
     *
     * @return Nombre del hotel
     */
    public String getNombreHotel() {
        return nombreHotel;
    }

    /**
     * Establece el nombre del hotel.
     *
     * @param nombreHotel Nombre del hotel
     */
    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    /**
     * Obtiene la categoría del hotel.
     *
     * @return Categoría del hotel
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del hotel.
     *
     * @param categoria Categoría del hotel
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene el precio del hotel.
     *
     * @return Precio del hotel
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del hotel.
     *
     * @param precio Precio del hotel
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Verifica la disponibilidad del hotel.
     *
     * @return True si el hotel está disponible, False de lo contrario
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Establece la disponibilidad del hotel.
     *
     * @param disponible Disponibilidad del hotel
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
