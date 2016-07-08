/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author T-107
 */
public class Biblioteca {
    public static void main(String[] args) {
        Estudiante e=new Estudiante();
           // e.setNombre("Juan");
        Profesor p=new Profesor();
            //p.setNombre("Ana");
        Libro lpa1=new Libro();
            lpa1.setTitulo("Doctrina del shock");
        Libro lpa2=new Libro();
            lpa2.setTitulo("El mundo patas Arriba");
        Libro lpp=new Libro();
            lpp.setTitulo("Como ser buen maestro");
            
        Prestamos ppa =new Prestamos();
        Prestamos ppp =new Prestamos();
                
       // ppa.setPrestamos(e,2);
        //ppp.setPrestamos(p,1);

        
        
    }
    
}
