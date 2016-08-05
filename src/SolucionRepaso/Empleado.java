/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionRepaso;

/**
 *
 * @author T-107
 */
public class Empleado {
    Integer id;
    String nombre;
    Departamento depa;
    
    public void setId(Integer id){
        this.id=id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDepa(Departamento depa)throws EmpleadoNuloException{
        if(depa==null)throw new EmpleadoNuloException();
        this.depa=depa;
    }
    public Integer getId(){
        return id;
    }
    public String getNombre(){
        return nombre;                
    }
    public Departamento getDepa(){
        return depa;
    }
    public Empleado(){
        
    }
    
    public Empleado(Integer id, String nombre, Departamento depa)throws EmpleadoNuloException{
        this.id=id;
        this.nombre=nombre;
        if(depa==null)throw new EmpleadoNuloException();
        this.depa=depa;
    }
    
}
