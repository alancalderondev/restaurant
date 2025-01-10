package com.alancalderondev.restaurant.model;

import jakarta.persistence.*;

@Entity
public class admin extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefono;
    private String usuario;
    private String password;
    private String rol;

   //constructor con parametros
    public admin(String nombre, String apellido, String telefono, String usuario, String password, String rol) {
        super(nombre, apellido);
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }
    
    //constructor vacio
    public admin() {

    }

    //Getters y Setters
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

    public String getRol() {
        return rol;
    }

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

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", telefono='" + telefono + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}