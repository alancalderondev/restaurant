package com.alancalderondev.restaurant.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private String mesa;
    //ManyToOne con cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private cliente cliente;

    //Constructor con parametros
    public Reserva(String nombre, LocalDate fecha, LocalTime hora, String mesa, cliente cliente) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    //Constructor vacio
    public Reserva() {

    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
    public String getMesa() {
        return mesa;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", mesa='" + mesa + '\'' +
                ", cliente=" + cliente.getNombre() + '\'' +
                '}';
    }
}