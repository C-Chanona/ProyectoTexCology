package com.upchiapas.texcology.models;

public class Fichas {
    String nombre,apellido,correo,fecha,comentario,lugar;

    public Fichas(String nombre, String apellido, String correo, String fecha, String comentario, String lugar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.comentario = comentario;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String toString() {
        return "Donador: \t " + nombre + " " + apellido + "\n"+ "\n" +
                "Lugar: \t " + lugar + "\n" + "\n" +
                "Fecha: \t " + fecha + "\n" + "\n" +
                "Comentario: \t " + comentario + "\n" + "\n" +
                "\t\t" + "En esta ficha se muestran los datos para que\n " +
                "\t\tpuedas acudir a la sucursal elegida; asi, \n " +
                "\t\tno,tendremos incomvenientes para tu atencion \n" +
                "\t\tte recordamos que la sucursal esta abierta" + "\n" +
                "\t\ta partir de los dias: " + "\n" + "\n" +
                "\t\t" + "Lunes - Viernes de 08:00 a 16:00 horas" + "\n" + "\n" +
                "\t\t" + "Sabados y Domingos de 09:00 a 14:00 horas" + "\n" + "======================================== \n";
    }
}
