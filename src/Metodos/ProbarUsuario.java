/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


public class ProbarUsuario {
    public static void main(String[] args) {
        //Creamos un objeto con el constructor de defecto de la clase usuario
        Usuario u1=new Usuario();
        u1.setEdad(19); //Se asigna el valor (set) -> mutador
        
        /*
        En el main NO DEBE existir ninguna asignacion 
            "los atributos deben ser privados"
        Por cada atributo debe haber un metodo mutador
        Creamos un objeto de la clase logica
        */
        OperacionesUsuario o=new OperacionesUsuario();
        
        System.out.println("Tu edad en dias es "+o.calcularEdadEnDias(u1));
        // se pide el valor (get) accesorio
    }
    
}
