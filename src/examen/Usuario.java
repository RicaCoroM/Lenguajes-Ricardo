/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class Usuario {
    private String nombre;
    private ArrayList<Libro> libros;

    public Usuario(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }       

    public String getNombre() {
        return nombre;
    }  

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
