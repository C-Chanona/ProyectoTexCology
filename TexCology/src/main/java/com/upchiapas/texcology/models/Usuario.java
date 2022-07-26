package com.upchiapas.texcology.models;

public class Usuario {

    String Nombre, Usuario,Contraseña;
    public Usuario(String nombre, String usuario, String contraseña) {
        this.Nombre = nombre;
        this.Usuario = usuario;
        this.Contraseña = contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
