package com.di.examen.modelos;

import java.time.LocalDate;

public class Usuario {

    private String dni;
    private LocalDate fechaAltaSancion;

    public Usuario(String dni, LocalDate fechaAltaSancion) {
        this.dni = dni;
        this.fechaAltaSancion = fechaAltaSancion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAltaSancion() {
        return fechaAltaSancion;
    }

    public void setFechaAltaSancion(LocalDate fechaAltaSancion) {
        this.fechaAltaSancion = fechaAltaSancion;
    }

    public void sancionar(){
        setFechaAltaSancion(LocalDate.now().plusDays(10));
    }

    public void quitarSancion(){
        setFechaAltaSancion(null);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", fechaAltaSancion=" + fechaAltaSancion +
                '}';
    }
}
