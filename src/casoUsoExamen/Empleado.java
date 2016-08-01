/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoUsoExamen;

/**
 *
 * @author T-107
 */
public class Empleado {
    
    int empleado;
    String nombre;
    Departamento departamento;

    public Empleado() {
    }

    public Empleado(int empleado, String nombre, Departamento departamento) {
        this.empleado = empleado;
        this.nombre = nombre;
        this.departamento = departamento;
    }
    
    
}
