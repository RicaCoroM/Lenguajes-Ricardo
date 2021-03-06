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
    
    private Integer empleado;
    private String nombre;
    private Departamento departamento;

    public Empleado() {
    }

    public Empleado(Integer empleado, String nombre, Departamento departamento) {
        this.empleado = empleado;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        
        this.departamento = departamento;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Integer empleado)throws EmpleadoIdNullException{
        if(empleado==null)throw new EmpleadoIdNullException();
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}
