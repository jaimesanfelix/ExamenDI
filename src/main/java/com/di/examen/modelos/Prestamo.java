package com.di.examen.modelos;

import java.time.LocalDate;

public class Prestamo {

    private int id;
    private String dni;
    private LocalDate fechaDevolucion;

    public Prestamo(int id, String dni, LocalDate fechaDevolucion) {
        this.id = id;
        this.dni = dni;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo(int id, String dni) {
        this.id = id;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", dni=" + dni +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }




}
