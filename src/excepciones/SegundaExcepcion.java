/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *Aqui usaremos las excepciones de tipo checked de las que TU 
 * tienes que hacerte cargo de ellas, vamos a usar un paquete que no
 * se encuentra por defecto, tienes que agregarlo con un import * 
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    
    public static void main(String[] args) {
        
        File f=new File("D:\\archivo");
        //input = leer algo
        //ouput = escribir algo
        try {            
            FileInputStream fis=new FileInputStream(f);
        } catch (FileNotFoundException ex) {
         /**
          * INVESTIGAR  que significa el bloque "try catch" 
          * contrastarlo con el throws
          */   
        }
    }
    
}
