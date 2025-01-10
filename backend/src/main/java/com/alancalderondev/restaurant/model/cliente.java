package com.alancalderondev.restaurant.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class cliente extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefono;
    private String usuario;
    private String password;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    //Constructor con parametros
    public cliente(String nombre, String apellido, String telefono, String usuario, String password) {
        super(nombre, apellido);
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
    }

    //Constructor vacio
    public cliente() {

    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "id=" + id +
                ", telefono='" + telefono + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", reservas=" + reservas + '\'' +
                '}';
    }
}