package com.di.examen.modelos;

import java.time.LocalDate;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;


    public Biblioteca(List<Libro> libros, List<Usuario> usuarios, List<Prestamo> prestamos) {
        this.libros = libros;
        this.usuarios = usuarios;
        this.prestamos = prestamos;

    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void altaLibro(int id, String titulo, String isbn){
        Libro libro = new Libro(id, titulo, isbn);
        libros.add(libro);
    }

    public  void bajaLibro(int id, String titulo, String isbn){
        Libro libro = new Libro(id, titulo, isbn);
        libros.remove(libro);
    }

    public void prestar(Libro libro, Usuario usuario){
        Prestamo prestamo = new Prestamo(libro.getId(), usuario.getDni());
        prestamos.add(prestamo);
    }

    public void devolver(Libro libro, Usuario usuario){
        Prestamo prestamo = new Prestamo(libro.getId(), usuario.getDni());
        prestamos.remove(prestamo);
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + libros +
                ", prestamos=" + prestamos +
                ", usuarios=" + usuarios +
                '}';
    }
}
